package com.kolade.phonebookSystem.model


data class Contact(val name: String, val phoneNumber: String, val address: String) {
    override fun toString(): String {
        return "Name: $name, Phone Number: $phoneNumber, Address: $address"
    }
}