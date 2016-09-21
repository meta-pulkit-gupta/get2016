package com.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.rpc.ServiceException;

/**
 * Servlet implementation class Conversion
 */
@WebServlet("/index")
public class Conversion extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();  
		ConverterServiceLocator converterServiceLocator = new ConverterServiceLocator();
		converterServiceLocator.setConverterEndpointAddress("http://localhost:8080/TemperatureConverter/services/Converter");
		try {
			Converter converter = converterServiceLocator.getConverter();
			out.println(converter.fahrenhietToCelcius(Double.parseDouble(request.getParameter("temperature"))));
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
}
