package com.rateCalculator.exchangeRate.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Map;

@Data

@NoArgsConstructor
public class ExchangeResponse {
    private String base;
    private Map<String, Double> rates;
}
