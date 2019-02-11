package org.metropolis.user

import com.fasterxml.jackson.annotation.JsonInclude

@JsonInclude(JsonInclude.Include.NON_NULL)
data class UserDTO(val username: String, val userType: UserType)