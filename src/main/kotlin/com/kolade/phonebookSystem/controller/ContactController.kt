package com.kolade.phonebookSystem.controller

import com.kolade.phonebookSystem.model.ApiResponse
import com.kolade.phonebookSystem.model.Contact
import com.kolade.phonebookSystem.repository.ContactRepository
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 * Created by
 *
 * @Author: Kolade Oluwadare - TechEbenezer
 * @Date 08/11/2023  || 5:09 AM
 * @Version 1.0
 */

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/contact")
class ContactController(@Autowired val contactRepository: ContactRepository) {

    @PostMapping("/create")
    fun createContact(@RequestBody contact: Contact): ApiResponse {
        return contactRepository.saveContact(contact)
    }

    @GetMapping("/{phoneNumber}")
    fun getContact(@PathVariable phoneNumber: String): ApiResponse {
        return contactRepository.getContactByPhoneNumber(phoneNumber)
    }

    @GetMapping("/all")
    fun getAllContacts(): ApiResponse {
        return contactRepository.getAllContacts()
    }

    @PutMapping("/{phoneNumber}")
    fun updateContact(@PathVariable phoneNumber: String, @RequestBody updatedContact: Contact): ApiResponse {
        return contactRepository.updateContact(phoneNumber, updatedContact)
    }

    @DeleteMapping("/{phoneNumber}")
    fun deleteContact(@PathVariable phoneNumber: String): ApiResponse {
        return contactRepository.deleteContactByPhoneNumber(phoneNumber)
    }
}
