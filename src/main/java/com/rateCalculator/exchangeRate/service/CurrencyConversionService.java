package com.rateCalculator.exchangeRate.service;

import com.rateCalculator.exchangeRate.feignClient.RateFeignClient;
import com.rateCalculator.exchangeRate.model.ConversionRequest;
import com.rateCalculator.exchangeRate.model.ConversionResponse;
import com.rateCalculator.exchangeRate.model.ExchangeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class CurrencyConversionService {

    @Autowired
    private RateFeignClient rateFeignClient;
    public ConversionResponse convertCurrency(ConversionRequest conversionRequest) {
        ExchangeResponse rates = rateFeignClient.getExchangeRate(conversionRequest.getFrom());


            Double conversionRate = rates.getRates().get(conversionRequest.getTo());
            if (conversionRate == null) {
                throw new RuntimeException("Conversion rate not available for " + conversionRequest.getTo());
            }

            double convertedAmount = conversionRequest.getAmount() * conversionRate;
            return new ConversionResponse(conversionRequest.getFrom(), conversionRequest.getTo(), conversionRequest.getAmount(), convertedAmount);
    }

}
