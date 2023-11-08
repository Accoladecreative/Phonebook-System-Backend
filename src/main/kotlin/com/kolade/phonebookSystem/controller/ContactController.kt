package com.kolade.phonebookSystem.controller

import com.kolade.phonebookSystem.model.Contact
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


@RestController
@RequestMapping("api/v1/contact/")
@RequiredArgsConstructor
class ContactController {

@GetMapping('all/')
    fun getAllContact():List<Contact>{

    }



}