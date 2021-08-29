package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.feign.StockPriceClient;
import com.example.demo.request.StockPriceApiResponse;
import com.example.demo.response.StockCalcApiResponse;

@Service

public class StockCalciServiceImpl implements StockCalcService {
	
	
	@Autowired
	StockPriceClient  client;
	
	public StockCalcApiResponse  getStocksCost(String companyName,Integer quantity) {
		StockCalcApiResponse calcApiResponse=new StockCalcApiResponse();
		
		StockPriceApiResponse feignClientResponse=client.invokeStockPriceApi(companyName);
		
		Double toatlCost=feignClientResponse.getCompanyStockPrice()*quantity;
		calcApiResponse.setCompanyName(companyName);
		calcApiResponse.setPortNumber(feignClientResponse.getPortNumber());
		calcApiResponse.setQauntity(quantity);
		
		calcApiResponse.setTotalCost(toatlCost);
		return calcApiResponse;
		
		
		
	}

}
