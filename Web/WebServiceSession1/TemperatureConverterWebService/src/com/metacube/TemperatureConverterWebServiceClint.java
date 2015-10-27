package com.metacube;

public class TemperatureConverterWebServiceClint {
	public static void main(String[] args) {
		ConverterServiceLocator converterServiceLocator = new ConverterServiceLocator();
		converterServiceLocator.setConverterEndpointAddress("http://localhost:8080/TemperatureConverter/services/Converter");
		try {
			Converter converter = converterServiceLocator.getConverter();
			
			System.out.println(converter.temperatureConverterFahrenheitTOCelsius(40));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
