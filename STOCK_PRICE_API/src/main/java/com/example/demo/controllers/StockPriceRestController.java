package com.example.demo.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.bindings.StockPriceResponse;
import com.example.demo.entity.StockPrice;
import com.example.demo.service.StockPriceService;

@RestController
public class StockPriceRestController {

	private Logger logger=LoggerFactory.getLogger(getClass());
	@Autowired
	StockPriceService stockPriceService;

	@GetMapping("/price/{companyName}")
	public ResponseEntity<StockPriceResponse> getStockPrice(@PathVariable String companyName) {

		
		StockPriceResponse response = stockPriceService.getStockPriceResponse(companyName);
		logger.info("StockPriceRestController.class and response generated  is {} ",response);
		
		return new ResponseEntity<>(response, HttpStatus.OK);

	}

}
