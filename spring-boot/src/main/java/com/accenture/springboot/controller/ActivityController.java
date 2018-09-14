package com.accenture.springboot.controller;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ActivityController {

	@RequestMapping("/")
	public String index() {
		return "index";
	}

	@RequestMapping("/display")
	public String display(@RequestParam String firstName, String lastName,
			String date, Model model) {

		int age = 0;

		try {
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
			LocalDate birthDate = LocalDate.parse(date, formatter);
			LocalDate currentDate = LocalDate.now();

			age = Period.between(birthDate, currentDate).getYears();

		if (age < 0) {
			throw new Exception("Age cannot be less than 1");
		}

		} catch(Exception e) {
			return "errorPage";
		}

		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		model.addAttribute("age", age);
		return "display";
	}
}
