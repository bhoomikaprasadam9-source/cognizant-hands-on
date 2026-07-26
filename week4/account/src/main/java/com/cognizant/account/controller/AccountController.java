package com.cognizant.account.controller;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AccountController {

    @GetMapping("/accounts/{number}")
    public Map<String, Object> getAccount(@PathVariable String number) {

        Map<String, Object> account = new HashMap<>();

        account.put("number", number);
        account.put("type", "Savings");
        account.put("balance", 234343);

        return account;
    }

}