package com.rateCalculator.exchangeRate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@AllArgsConstructor
@Data
@NoArgsConstructor
public class ConversionRequest {
    private String from;
    private String to;
    private Double amount;
}
