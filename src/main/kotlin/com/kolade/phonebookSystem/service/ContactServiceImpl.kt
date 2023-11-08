package com.kolade.phonebookSystem.service

import com.kolade.phonebookSystem.model.ApiResponse
import com.kolade.phonebookSystem.model.Contact
import com.kolade.phonebookSystem.repository.ContactRepository
import lombok.RequiredArgsConstructor
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class ContactServiceImpl(@Autowired val contactRepository: ContactRepository) : ContactService {



    override fun createContact(contact: Contact): ApiResponse? {
        return contactRepository.saveContact(contact)
    }

    override fun getContact(phoneNumber: String): ApiResponse? {
        return contactRepository.getContactByPhoneNumber(phoneNumber)
    }

    override fun getALlContacts(): ApiResponse? {
       return contactRepository.getAllContacts()
    }
    override fun updateContact(phoneNumber: String, updatedContact: Contact): ApiResponse {
        return contactRepository.updateContact(phoneNumber, updatedContact)
    }

    override fun deleteContact(phoneNumber: String): ApiResponse? {
        return contactRepository.deleteContactByPhoneNumber(phoneNumber)
    }


}
