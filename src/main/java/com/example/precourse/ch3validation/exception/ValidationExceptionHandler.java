package com.example.precourse.ch3validation.exception;

import com.example.precourse.ch3validation.model.Ch3Api;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import java.util.stream.Collectors;

@Slf4j
@RestControllerAdvice
public class ValidationExceptionHandler {
    @ExceptionHandler(value = {MethodArgumentNotValidException.class})
    public ResponseEntity<Ch3Api> validationException(
            MethodArgumentNotValidException exception
    ){
        log.error("", exception);
            var errorMessageList = exception.getFieldErrors().stream()
                    .map(it -> {
                        var format = "%s : { %s } 은 %s";
                        var message = String.format(format, it.getField(), it.getRejectedValue(), it.getDefaultMessage());
                        return  message;
                    }).collect(Collectors.toList());

            var error = Ch3Api.Error
                    .builder()
                    .errorMessage(errorMessageList)
                    .build();

            var errorResponse = Ch3Api
                    .builder()
                    .resultCode(String.valueOf(HttpStatus.BAD_REQUEST.value()))
                    .resultMessage(HttpStatus.BAD_REQUEST.getReasonPhrase())
                    .error(error)
                    .build();

            return ResponseEntity
                    .status(HttpStatus.BAD_REQUEST)
                    .body(errorResponse);
        }

}
