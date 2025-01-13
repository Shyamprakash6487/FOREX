package com.rateCalculator.exchangeRate.service;

import com.rateCalculator.exchangeRate.feignClient.RateFeignClient;
import com.rateCalculator.exchangeRate.model.ExchangeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RateService {

    @Autowired
    private RateFeignClient rateFeignClient;


    public ExchangeResponse getExchangeRates(String fromCurrency){
        return rateFeignClient.getExchangeRate(fromCurrency);

    }
}
