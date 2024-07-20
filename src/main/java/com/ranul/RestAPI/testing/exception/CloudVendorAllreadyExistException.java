package com.ranul.RestAPI.testing.exception;

public class CloudVendorAllreadyExistException extends RuntimeException {

    public CloudVendorAllreadyExistException(String message) {super(message);}

    public CloudVendorAllreadyExistException(String message, Throwable cause) {super(message, cause);}
}
