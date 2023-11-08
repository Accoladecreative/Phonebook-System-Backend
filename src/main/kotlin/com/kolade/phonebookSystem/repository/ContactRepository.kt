package com.kolade.phonebookSystem.repository

import com.kolade.phonebookSystem.model.Contact
import com.kolade.phonebookSystem.model.ApiResponse
import java.util.*
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ContactRepository : JpaRepository<Contact, Long> {

    fun findByPhoneNumber(phoneNumber: String): Contact?

    fun saveContact(contact: Contact): ApiResponse {
        return if (findByPhoneNumber(contact.phoneNumber) == null) {
            save(contact)
            ApiResponse(success = true, message = "Contact created successfully")
        } else {
            ApiResponse(success = false, message = "Duplicate phone number")
        }
    }

    fun getContactByPhoneNumber(phoneNumber: String): ApiResponse {
        val contact = findByPhoneNumber(phoneNumber)
        return if (contact != null) {
            ApiResponse(success = true, message = "Contact found", data = contact)
        } else {
            ApiResponse(success = false, message = "Contact not found")
        }
    }

    fun getAllContacts(): ApiResponse {
        val contacts = findAll()
        return ApiResponse(success = true, message = "All contacts retrieved", data = contacts)
    }

    fun updateContact(phoneNumber: String, updatedContact: Contact): ApiResponse {
        val existingContact = findByPhoneNumber(phoneNumber)
        return if (existingContact != null) {
            updatedContact.id = existingContact.id // Ensure the ID is retained
            save(updatedContact)
            ApiResponse(success = true, message = "Contact updated successfully")
        } else {
            ApiResponse(success = false, message = "Contact not found")
        }
    }

    fun deleteContactByPhoneNumber(phoneNumber: String): ApiResponse {
        val contact = findByPhoneNumber(phoneNumber)
        return if (contact != null) {
            delete(contact)
            ApiResponse(success = true, message = "Contact deleted successfully")
        } else {
            ApiResponse(success = false, message = "Contact not found")
        }
    }
}
