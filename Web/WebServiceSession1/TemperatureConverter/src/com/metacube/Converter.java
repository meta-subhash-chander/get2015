package com.metacube;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class Converter {
	@WebMethod
	public float temperatureConverterFahrenheitTOCelsius(float f){
		return (f-32)*5/9;
	}

}
