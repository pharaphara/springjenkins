package com.formation.demo.rest;

import com.formation.demo.service.Calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculateurRest {

        @Autowired
        private Calculator calculator;

        @GetMapping("/sum")
        public String sum(@RequestParam("a") Integer a,@RequestParam("b") Integer b){
            return String.valueOf(calculator.sum(a, b));
        }
    
}
