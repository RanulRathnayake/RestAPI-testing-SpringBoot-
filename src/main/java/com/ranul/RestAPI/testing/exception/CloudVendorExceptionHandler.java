package com.ranul.RestAPI.testing.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class CloudVendorExceptionHandler {

    @ExceptionHandler(value = {CloudVendorNotFoundException.class})
    public ResponseEntity<Object> handleCloudVendorNotFoundExeption
            (CloudVendorNotFoundException cloudVendorNotFoundException)
    {
        CloudVendorException cloudVendorExeption = new CloudVendorException(
                cloudVendorNotFoundException.getMessage(),
                cloudVendorNotFoundException.getCause(),
                HttpStatus.NOT_FOUND
        );

        return new ResponseEntity<>(cloudVendorExeption, HttpStatus.NOT_FOUND);
    }
    @ExceptionHandler(value = {CloudVendorAllreadyExistException.class})
    public ResponseEntity<Object> handleCloudVendorAllreadyExistExeption
            (CloudVendorAllreadyExistException cloudVendorAllreadyExistException)
    {
        CloudVendorException cloudVendorExeption = new CloudVendorException(
                cloudVendorAllreadyExistException.getMessage(),
                cloudVendorAllreadyExistException.getCause(),
                HttpStatus.ALREADY_REPORTED
        );

        return new ResponseEntity<>(cloudVendorExeption, HttpStatus.ALREADY_REPORTED);
    }
}
