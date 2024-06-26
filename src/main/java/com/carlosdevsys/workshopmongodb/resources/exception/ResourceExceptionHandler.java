package com.carlosdevsys.workshopmongodb.resources.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.carlosdevsys.workshopmongodb.services.exception.ObjectNotFoundExcepition;

import jakarta.servlet.http.HttpServletRequest;

@ControllerAdvice
public class ResourceExceptionHandler {

     @ExceptionHandler(ObjectNotFoundExcepition.class)
     public ResponseEntity<StandardError> objectNotFound(ObjectNotFoundExcepition e, HttpServletRequest request){
    	 
    	 HttpStatus status = HttpStatus.NOT_FOUND;
    	 StandardError err = new StandardError(System.currentTimeMillis(), status.value(), "não encontrado", e.getMessage(), request.getRequestURI());
    	 return ResponseEntity.status(status).body(err);
     }

}
