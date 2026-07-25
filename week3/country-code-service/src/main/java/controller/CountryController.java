package com.cognizant.countrycodeservice.controller;

import com.cognizant.countrycodeservice.Country;
import com.cognizant.countrycodeservice.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class CountryController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/countries/{code}")
    public Country getCountry(@PathVariable String code) {

        return countryService.getCountry(code);

    }

}
