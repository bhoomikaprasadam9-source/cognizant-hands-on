package com.cognizant.loan.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class LoanController {

    @GetMapping("/loans/{number}")
    public Map<String, Object> getLoan(@PathVariable String number) {

        Map<String, Object> loan = new HashMap<>();

        loan.put("number", number);
        loan.put("type", "Car");
        loan.put("loan", 400000);
        loan.put("emi", 3258);
        loan.put("tenure", 18);

        return loan;
    }

}