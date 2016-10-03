package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.vo.Car;

import fascade.CarFascade;
import fascade.CarFascadeFactory;

@Controller
public class ListSpringController {

	private CarFascade carFascade;

	@RequestMapping(value = "/ListCars", method = RequestMethod.GET)
	public @ResponseBody List<Car> getCarList() {
		carFascade = CarFascadeFactory.get();
		List<Car> cars = carFascade.getCars();
		return cars;
	}

	@RequestMapping(value = "/EditCar", method = RequestMethod.GET)
	public @ResponseBody Car editCar(@RequestParam("id") String id) {

		Car car = carFascade.getCarById(Integer.parseInt(id));
		return car;
	}

	@RequestMapping(value = "/viewCar", method = RequestMethod.GET)
	public @ResponseBody Car viewCar(@RequestParam("id") String id) {
		return editCar(id);
	}

	@RequestMapping(value = "/saveCar")
	public String saveCar(HttpServletRequest request) {
		String company = request.getParameter("company");
		String model = request.getParameter("model");
		int engineInCC = Integer.parseInt(request.getParameter("engineInCC"));
		float fuelCapacity = Float.parseFloat(request
				.getParameter("fuelCapacity"));
		float milage = Float.parseFloat(request.getParameter("milage"));
		int price = Integer.parseInt(request.getParameter("price"));
		float roadTax = Float.parseFloat(request.getParameter("roadTax"));
		String ac = request.getParameter("ac");
		String powerSteering = request.getParameter("powerSteering");
		String accessoryKit = request.getParameter("accessoryKit");
		Car car = new Car(company, model, engineInCC, fuelCapacity, milage,
				price, roadTax, ac, powerSteering, accessoryKit);
		carFascade.saveCar(car);
		return "ListController";
	}

	
}
