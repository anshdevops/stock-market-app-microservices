package com.example.demo.feign;

import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.request.StockPriceApiResponse;


@FeignClient("STOCK-PRICE-API")
//@LoadBalancerClient("STOCK-PRICE-API")
public interface StockPriceClient {
	
	@GetMapping("/price/{companyName}")
	StockPriceApiResponse invokeStockPriceApi(@PathVariable String companyName);

}
