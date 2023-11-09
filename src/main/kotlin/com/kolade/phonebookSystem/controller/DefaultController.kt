package com.kolade.phonebookSystem.controller

import com.kolade.phonebookSystem.model.ApiResponse
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/")
class DefaultController {

    @GetMapping()
    fun rootUrl(): ApiResponse {
        return ApiResponse(true, "Connection Successful, kindly use this guide to navigate the app",ContactControllerDocumentation )
    }
    @GetMapping("/hi")
    fun root2():String{
        return "Hello there, wellcome";
    }

    object ContactControllerDocumentation {

        val getAllContactsDescription = "Get a list of all contacts.\n"
        val getAllContactsEndpoint = "GET /api/contacts"
        val getAllContactsExample = """
        Example:
        - Request: GET /api/contacts
        - Response: Retrieves a list of all contacts in the system.
    """.trimIndent()+"\n"

        val createContactDescription = "Create a new contact."
        val createContactEndpoint = "POST /api/contacts"
        val createContactExample = """
        Example:
        - Request: POST /api/contacts
          Body: { "name": "John Doe", "phoneNumber": "1234567890", "email": "john@example.com" }
        - Response: Creates a new contact with the provided information.
    """.trimIndent()

        val deleteContactDescription = "Delete a contact by ID."
        val deleteContactEndpoint = "DELETE /api/contacts/{id}"
        val deleteContactExample = """
        Example:
        - Request: DELETE /api/contacts/1
        - Response: Deletes the contact with ID 1 from the system.
    """.trimIndent()

        val updateContactDescription = "Update an existing contact by ID."
        val updateContactEndpoint = "PUT /api/contacts/{id}"
        val updateContactExample = """
        Example:
        - Request: PUT /api/contacts/1
          Body: { "name": "Updated Name", "phoneNumber": "9876543210", "email": "updated@example.com" }
        - Response: Updates the contact with ID 1 using the provided information.
    """.trimIndent()

        val getContactByPhoneNumberDescription = "Get a contact by phone number."
        val getContactByPhoneNumberEndpoint = "GET /api/contacts/phone/{phoneNumber}"
        val getContactByPhoneNumberExample = """
        Example:
        - Request: GET /api/contacts/phone/1234567890
        - Response: Retrieves the contact with phone number 1234567890.
    """.trimIndent()
    }


}