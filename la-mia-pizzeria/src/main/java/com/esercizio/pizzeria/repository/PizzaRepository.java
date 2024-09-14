package com.esercizio.pizzeria.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esercizio.pizzeria.Model.Pizza;

public interface PizzaRepository extends JpaRepository<Pizza, Integer> {

}
