package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CarSpringController {
	
	@RequestMapping("/")
	public String showLandingPage() {
		return "landing page";
	}

	@RequestMapping("ListController")
	public String showListPage() {
		return "list";
	}

	@RequestMapping("CarController")
	public String saveCar(ModelMap model) {
		model.addAttribute("pageType", "SaveCar");
		return "save car";
	}

	@RequestMapping(value = "/updatecar", method = RequestMethod.GET)
	public String editCarById(@RequestParam("id") String id, ModelMap model) {
		model.addAttribute("id", id);
		model.addAttribute("pageType", "Edit");
		return "save car";
	}

	@RequestMapping(value = "/viewcar", method = RequestMethod.GET)
	public String viewCarById(@RequestParam("id") String id, ModelMap model) {
		model.addAttribute("id", id);
		model.addAttribute("pageType", "View");
		return "save car";
	}
}
