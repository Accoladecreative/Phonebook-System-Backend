package com.kolade.phonebookSystem.service

import com.kolade.phonebookSystem.model.ApiResponse
import com.kolade.phonebookSystem.model.Contact


interface ContactService {

    fun createContact(contact: Contact?): ApiResponse?
        fun getContact(phoneNUmber: String?): ApiResponse?
    fun getALlContacts(allContacts: List<Contact>?): ApiResponse?
    fun updateContact(phoneNUmber: String?): ApiResponse?
    fun deleteContact(phoneNUmber: String?): ApiResponse?

}