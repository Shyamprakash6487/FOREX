package com.rateCalculator.exchangeRate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ConversionResponse {
    private String from;
    private String to;
    private double amount;
    private double convertedAmount;
}
