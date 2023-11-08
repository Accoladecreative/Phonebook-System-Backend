package com.kolade.phonebookSystem.service

import com.kolade.phonebookSystem.model.ApiResponse
import com.kolade.phonebookSystem.model.Contact


interface ContactService {

    fun createContact(contact: Contact): ApiResponse?
    fun getContact(phoneNumber: String): ApiResponse?
    fun getALlContacts(): ApiResponse?
    fun updateContact(phoneNumber: String, updatedContact: Contact): ApiResponse
    fun deleteContact(phoneNumber: String): ApiResponse?

}