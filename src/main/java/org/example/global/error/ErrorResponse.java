package org.example.global.error;

import lombok.Builder;

@Builder
public class ErrorResponse {
    private final int statusCode;
    private final String message;
}