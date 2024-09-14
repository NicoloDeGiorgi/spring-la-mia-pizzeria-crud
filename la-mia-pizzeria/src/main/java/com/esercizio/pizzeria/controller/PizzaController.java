package com.esercizio.pizzeria.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import com.esercizio.pizzeria.Model.Pizza;
import com.esercizio.pizzeria.repository.PizzaRepository;

@Controller
@RequestMapping("/pizzas")
public class PizzaController {

	@Autowired
	private PizzaRepository repository;

	@GetMapping
	public String index(Model model) {

		List<Pizza> pizzaList = repository.findAll();
		model.addAttribute("pizzas", pizzaList);

		return "pizzas/index";
	}
}
