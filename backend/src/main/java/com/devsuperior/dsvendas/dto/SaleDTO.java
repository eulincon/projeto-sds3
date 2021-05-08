package com.devsuperior.dsvendas.dto;

import lombok.*;

import java.time.LocalDate;

@Data
public class SaleDTO {
    private Long id;
    private Integer visited;
    private Integer deals;
    private Double amount;
    private LocalDate date;

    private SellerDTO seller;
}
