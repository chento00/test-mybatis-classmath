package com.example.test1.dto;
import org.springframework.http.HttpStatus;
import java.time.LocalDateTime;

public record RespondAPi<T>(
        LocalDateTime time,
        HttpStatus status,
         String message,
         T data) {
}
