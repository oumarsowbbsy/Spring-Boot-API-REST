package com.example.demo.exception;

import java.util.*;

public class ErrorDetails {
    private Date timestamps;
    private String message;
    private String details;

    public ErrorDetails(Date timestamps, String message, String details) {
        this.timestamps = timestamps;
        this.message = message;
        this.details = details;
    }

    public Date getTimestamps() {
        return timestamps;
    }



    public String getMessage() {
        return message;
    }



    public String getDetails() {
        return details;
    }

}
