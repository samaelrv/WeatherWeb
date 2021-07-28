package com.weather.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface WeatherReport {
	
	@WebMethod
	public Double gettemperature(int zipcode);
}
