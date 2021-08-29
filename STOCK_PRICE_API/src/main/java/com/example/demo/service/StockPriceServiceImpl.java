package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.example.demo.bindings.StockPriceResponse;
import com.example.demo.repo.StockPriceRepo;

@Service
public class StockPriceServiceImpl implements StockPriceService {

	@Autowired
	StockPriceRepo stockPriceRepo;
	
	@Autowired
	Environment environment;

	@Override
	public StockPriceResponse getStockPriceResponse(String companyName) {
		// TODO Auto-generated method stub

		Double stockPrice = stockPriceRepo.findStockPriceByCompanyName(companyName);

		StockPriceResponse response = new StockPriceResponse();
		response.setCompanyName(companyName);
		response.setCompanyStockPrice(stockPrice);
		response.setPortNumber(Integer.parseInt(environment.getProperty("server.port")));

		return response;
	}

}
