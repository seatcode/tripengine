package org.metropolis.common

import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.ExceptionHandler
import org.springframework.web.bind.annotation.RestControllerAdvice
import javax.persistence.EntityNotFoundException
import javax.servlet.http.HttpServletResponse

/**
 * Exception handler class to centralize all controllers Exception
 */
@RestControllerAdvice
class ExceptionHandler {

    @ExceptionHandler(EntityNotFoundException::class)
    fun handleEntityNotFound(ex: Exception, resp: HttpServletResponse) =
        resp.sendError(HttpStatus.NOT_FOUND.value(), ex.message)

    @ExceptionHandler(EmptyResultDataAccessException::class)
    fun handleEmptyResult(ex: Exception, resp: HttpServletResponse) =
        resp.sendError(HttpStatus.BAD_REQUEST.value(), ex.message)


}