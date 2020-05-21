package com.practice.conversionservice;

import java.math.BigDecimal;

public class CurrencyConversionBean {
	
	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionDecimal;
	private BigDecimal amount;
	private BigDecimal calculatedAmount;
	private int port;
	
	
	public CurrencyConversionBean() {
		
	}
	public CurrencyConversionBean(Long id, String from, String to, BigDecimal conversionDecimal, BigDecimal amount,
			BigDecimal calculatedAmount, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionDecimal = conversionDecimal;
		this.amount = amount;
		this.calculatedAmount = calculatedAmount;
		this.port = port;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionDecimal() {
		return conversionDecimal;
	}
	public void setConversionDecimal(BigDecimal conversionDecimal) {
		this.conversionDecimal = conversionDecimal;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
	public BigDecimal getCalculatedAmount() {
		return calculatedAmount;
	}
	public void setCalculatedAmount(BigDecimal calculatedAmount) {
		this.calculatedAmount = calculatedAmount;
	}
	public int getPort() {
		return port;
	}
	public void setPort(int port) {
		this.port = port;
	}
	
	

}
