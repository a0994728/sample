package com.example.demo.controller;

import com.example.entity.TblCountry;
import com.example.repository.TblCountryRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path = "/demo")
public class DemoController {

  @Autowired
  private TblCountryRepository tblCountryRepository;

  @PostMapping(path = "/add")
  public @ResponseBody String addNewCountry(
    @RequestParam String countryCode,
    @RequestParam String countryName
  ) {
    TblCountry tblCountry = new TblCountry();
    tblCountry.setCountryCode(countryCode);
    tblCountry.setCountryName(countryName);
    tblCountryRepository.save(tblCountry);
    return "saved";
  }

  @GetMapping(path = "/all")
  public @ResponseBody Iterable<TblCountry> getAllCountries() {
    return tblCountryRepository.findAll();
  }
}
