package com.practice.microservice.currencyexhangeservice;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class ExchangeValue {
	
	@Id
	private Long id;
	@Column(name="currency_from")
	private String from;
	
	@Column(name="currency_to")
	private String to;	
	private BigDecimal conversionDecimal;
	private int port;
	
	public ExchangeValue() {
	}

	public ExchangeValue( Long id, String from, String to, BigDecimal conversionDecimal) {
		super();
		this.from = from;
		this.to = to;
		this.id = id;
		this.conversionDecimal = conversionDecimal;
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public BigDecimal getConversionDecimal() {
		return conversionDecimal;
	}

	public void setConversionDecimal(BigDecimal conversionDecimal) {
		this.conversionDecimal = conversionDecimal;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
	
	

}
