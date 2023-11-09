package com.kolade.phonebookSystem.repository
import com.kolade.phonebookSystem.model.Contact
import com.kolade.phonebookSystem.model.ApiResponse
import org.springframework.stereotype.Repository

@Repository
class ContactRepository {
    private var contacts: MutableList<Contact> = mutableListOf()
    private var nextId: Long = 1

    fun saveContact(contact: Contact): ApiResponse {
        // Check for duplicate phone numbers
        if (contacts.any { it.phoneNumber == contact.phoneNumber }) {
            return ApiResponse(success = false, message = "Duplicate phone number")
        }

        // Assign a unique ID and add the contact
        contact.id = nextId
        contacts.add(contact)
        nextId++

        return ApiResponse(success = true, message = "Contact created successfully")
    }

    fun getContactByPhoneNumber(phoneNumber: String): ApiResponse {
        val contact = contacts.find { it.phoneNumber == phoneNumber }
        return if (contact != null) {
            ApiResponse(success = true, message = "Contact found", data = contact)
        } else {
            ApiResponse(success = false, message = "Contact not found")
        }
    }

    fun getAllContacts(): ApiResponse {
        return ApiResponse(success = true, message = "All contacts retrieved", data = contacts)
    }

    fun updateContact(phoneNumber: String, updatedContact: Contact): ApiResponse {
        var existingContact = contacts.find { it.phoneNumber == phoneNumber }
        return if (existingContact != null) {
            // Update the contact's fields
//            existingContact.name = updatedContact.name
//            existingContact.email = updatedContact.email

            ApiResponse(success = true, message = "Contact updated successfully")
        } else {
            ApiResponse(success = false, message = "Contact not found")
        }
    }

    fun deleteContactByPhoneNumber(phoneNumber: String): ApiResponse {
        var contact = contacts.find { it.phoneNumber == phoneNumber }
        return if (contact != null) {
            contacts.remove(contact)
            ApiResponse(success = true, message = "Contact deleted successfully")
        } else {
            ApiResponse(success = false, message = "Contact not found")
        }
    }
}
