package com.example.springbootgraphql.dto;


import lombok.Data;

@Data
public class VehicleDto {
    private String type;
    private String modelCode;
    private String brandName;
}