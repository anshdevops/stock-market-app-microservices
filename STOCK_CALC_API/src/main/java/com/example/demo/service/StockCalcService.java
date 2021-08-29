package com.example.demo.service;

import com.example.demo.response.StockCalcApiResponse;

public interface StockCalcService {

	
	public StockCalcApiResponse  getStocksCost(String companyName,Integer quantity);
}
