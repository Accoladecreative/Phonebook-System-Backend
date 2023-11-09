package com.kolade.phonebookSystem

import com.kolade.phonebookSystem.model.ApiResponse
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class PhonebookSystemApplication

fun main(args: Array<String>) {
	runApplication<PhonebookSystemApplication>(*args)
}
