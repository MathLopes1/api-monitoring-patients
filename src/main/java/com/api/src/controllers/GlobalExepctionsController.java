package com.api.src.controllers;

import com.api.src.dto.Errors.ErrorMessageDTO;
import com.api.src.exepctions.BadRequestExepction;
import com.api.src.exepctions.NotFoundExepction;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class GlobalExepctionsController {

    @ExceptionHandler(value = BadRequestExepction.class)
    public ResponseEntity<ErrorMessageDTO> badRquestError (BadRequestExepction ex) {
        ErrorMessageDTO badRequest = new ErrorMessageDTO(HttpStatus.BAD_REQUEST.value(), ex.getErro(), ex.getDescricao());
        return new ResponseEntity<ErrorMessageDTO>(badRequest, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(value = NotFoundExepction.class)
    public ResponseEntity<ErrorMessageDTO> notFoundError (NotFoundExepction ex) {
        ErrorMessageDTO badRequest = new ErrorMessageDTO(HttpStatus.NOT_FOUND.value(), ex.getErro(), ex.getDescricao());
        return new ResponseEntity<ErrorMessageDTO>(badRequest, HttpStatus.NOT_FOUND);
    }
}
