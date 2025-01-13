package com.rateCalculator.exchangeRate.controller;

import com.rateCalculator.exchangeRate.model.ConversionRequest;
import com.rateCalculator.exchangeRate.model.ConversionResponse;
import com.rateCalculator.exchangeRate.model.ExchangeResponse;
import com.rateCalculator.exchangeRate.service.CurrencyConversionService;
import com.rateCalculator.exchangeRate.service.RateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ExchangeController {

    @Autowired
    private RateService rateService;

    @Autowired
    private CurrencyConversionService currencyConversionService;

    @GetMapping("/rate")
    public ExchangeResponse getExchangeRates(@RequestParam(required = false, defaultValue = "USD") String baseCurrency){
        return rateService.getExchangeRates(baseCurrency);
    }

    @PostMapping("/convert")
    public ConversionResponse convertCurrency(@RequestBody ConversionRequest conversionRequest){
        return currencyConversionService.convertCurrency(conversionRequest);
    }


}
