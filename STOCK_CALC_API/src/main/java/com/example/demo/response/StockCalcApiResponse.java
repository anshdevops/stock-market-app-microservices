package com.example.demo.response;

public class StockCalcApiResponse {
	
	private String companyName;
	private Integer portNumber;
	private Double totalCost;
	private Integer qauntity;
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	@Override
	public String toString() {
		return "StockCalcApiResponse [companyName=" + companyName + ", portNumber=" + portNumber + ", totalCost="
				+ totalCost + ", qauntity=" + qauntity + "]";
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public Integer getPortNumber() {
		return portNumber;
	}
	public void setPortNumber(Integer portNumber) {
		this.portNumber = portNumber;
	}
	public Double getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(Double totalCost) {
		this.totalCost = totalCost;
	}
	public Integer getQauntity() {
		return qauntity;
	}
	public void setQauntity(Integer qauntity) {
		this.qauntity = qauntity;
	}
	
	
	
	
	
	
	
	
}
