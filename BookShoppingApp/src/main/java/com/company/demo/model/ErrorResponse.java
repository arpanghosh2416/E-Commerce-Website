package com.company.demo.model;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ErrorResponse {

	private Long statusCode;
	private HttpStatus status;
	private LocalDateTime timeStamp;
	private String message;
	private String cause;

}
