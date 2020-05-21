package com.practice.conversionservice;

import java.math.BigDecimal;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class CurrencyConversionController {
	
	@Autowired
	private CurrencyExchangeServiceProxy currencyProxy;
	
	@GetMapping("/hello")
	public String helloCheck() {
		return "Hello";
	}
	
	//Using Feign
	@GetMapping("/currency-conversion-feign/from/{from}/to/{to}/amount/{amount}")
	public CurrencyConversionBean convertCurrencyFeign(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal amount) {
		CurrencyConversionBean response = currencyProxy.retrieveExchangeValue(from, to);
		
		return new CurrencyConversionBean(response.getId(),from,to, response.getConversionDecimal(), amount,
				  amount.multiply(response.getConversionDecimal()), response.getPort());
	}
	
	
	@GetMapping("/currency-conversion/from/{from}/to/{to}/amount/{amount}")
	public CurrencyConversionBean convertCurrency(@PathVariable String from, @PathVariable String to,
			@PathVariable BigDecimal amount) {

		
		  HashMap<String, String> map = new HashMap<>(); 
		  map.put("from",from);
		  map.put("to",to); 
		  ResponseEntity<CurrencyConversionBean> responseEntity = new RestTemplate().getForEntity("http://localhost:8000/currency-exchange/from/{from}/to/{to}",
		  CurrencyConversionBean.class, map); 
		  CurrencyConversionBean response = responseEntity.getBody(); 
		  
		  return new CurrencyConversionBean(response.getId(),from,to, response.getConversionDecimal(), amount,
		  amount.multiply(response.getConversionDecimal()), response.getPort());
		 
	}

}
