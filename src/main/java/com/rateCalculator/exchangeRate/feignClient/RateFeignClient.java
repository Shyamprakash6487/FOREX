package com.rateCalculator.exchangeRate.feignClient;


import com.rateCalculator.exchangeRate.model.ExchangeResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.service.annotation.GetExchange;

@FeignClient(name="rate-call",url="https://openexchangerates.org/api/latest.json?app_id=9e085229db5e45fe83632dab8785a7fe")
public interface RateFeignClient {
    @GetMapping
    ExchangeResponse getExchangeRate(@RequestParam("base") String base);

}
