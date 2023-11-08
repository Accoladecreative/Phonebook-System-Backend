package com.kolade.phonebookSystem.model

import lombok.AllArgsConstructor
import lombok.Data

//import javax.validation.constraints.NotNull;
@Data
@AllArgsConstructor
class ApiResponse(//    @NotNull
    private val success: Boolean, private val message: String
) {
    private val data: Any? = null
}