package com.weather.service;

import javax.jws.WebService;

@WebService(endpointInterface="com.weather.service.WeatherReport")
public class WeatherReportImpl implements WeatherReport {

	@Override
	public Double gettemperature(int zipcode) {
		if(zipcode==581343)
		{
			return 23.00;
		}
		else if(zipcode==581324) {
			return 35.89;
		}
		// TODO Auto-generated method stub
		return null;
	}

}
