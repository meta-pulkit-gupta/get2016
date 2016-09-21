package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Fascade.CarFascade;

import com.VO.Car;

/**
 * Servlet implementation class CarController
 */
@WebServlet("/CarController")
public class CarController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarController() {
        super();
        // TODO Auto-generated constructor stub
    }
    
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			RequestDispatcher dispatcher = request.getRequestDispatcher("Views/save car.jsp");
			dispatcher.forward(request, response);	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String company = request.getParameter("company");
		String model = request.getParameter("model");
		int engineInCC = Integer.parseInt(request.getParameter("engineInCC"));
		float fuelCapacity = Float.parseFloat(request
				.getParameter("fuelCapacity"));
		float milage = Float.parseFloat(request.getParameter("milage"));
		int price = Integer.parseInt(request.getParameter("price"));
		float roadTax = Float.parseFloat(request.getParameter("roadTax"));
		String ac = request.getParameter("ac");
		String powerSteering = request
				.getParameter("powerSteering");
		String accessoryKit = request
				.getParameter("accessoryKit");
		Car car = new Car(company, model, engineInCC, fuelCapacity, milage, price,
				roadTax, ac, powerSteering, accessoryKit);
		CarFascade carFascade = new CarFascade();
		carFascade.saveCar(car);
		RequestDispatcher dispatcher = request.getRequestDispatcher("ListController");
		dispatcher.forward(request, response);
	}

}
