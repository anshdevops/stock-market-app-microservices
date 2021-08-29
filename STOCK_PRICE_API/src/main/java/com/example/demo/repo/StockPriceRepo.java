package com.example.demo.repo;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.StockPrice;

public interface StockPriceRepo extends JpaRepository<StockPrice, Serializable> {
	
	
	
	@Query("select companyStockPrice from StockPrice where companyName=:companyName")
	Double findStockPriceByCompanyName(String companyName);

}
