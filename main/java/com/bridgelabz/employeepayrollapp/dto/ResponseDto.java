package com.bridgelabz.employeepayrollapp.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
public class ResponseDto {
    private String message;
    private Object data;

    public ResponseDto(String message, Object data) {
        this.message = message;
        this.data = data;
    }
}