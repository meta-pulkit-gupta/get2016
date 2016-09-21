package com.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Converter {

	@WebMethod
	public double fahrenhietToCelcius(double fahrenhiet){
		return ((fahrenhiet - 32)*5)/9;
	}	
}
