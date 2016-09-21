package com.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.VO.Car;

import Fascade.CarFascade;

/**
 * Servlet implementation class EditController
 */
@WebServlet("/EditController")
public class EditController extends HttpServlet {
	private static final long serialVersionUID = 1L;
 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int id = Integer.parseInt(request.getParameter("id"));
			CarFascade carFascade = new CarFascade();
			Car car = carFascade.getCarById(id);
			ServletContext context = getServletContext();
			context.setAttribute("viewPage", "false");
			context.setAttribute("car", car);
			RequestDispatcher dispatcher = request.getRequestDispatcher("Views/save car.jsp");
			dispatcher.forward(request, response);
	}

}
