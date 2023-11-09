package com.kolade.phonebookSystem.model

import lombok.AllArgsConstructor
import lombok.Data

//import javax.validation.constraints.NotNull;
//@Data
//@AllArgsConstructor
data class ApiResponse(
    val success: Boolean,
    val message: String,
    val data: Any? = null
) {
    override fun toString(): String {
        return "success=$success, message='$message', data=$data)"
    }
}