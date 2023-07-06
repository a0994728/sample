package com.example.demo.controller;

import com.example.entity.TblCountry;
import com.example.service.CountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

class Res {

  private String countryCode;
  private String countryName;

  public String getCountryCode() {
    return this.countryCode;
  }

  public String getCountryName() {
    return this.countryName;
  }
}

@RestController
@RequestMapping(path = "/demo")
public class DemoController {

  @Autowired
  private CountryService countryService;

  @PostMapping(path = "/add", consumes = "application/json")
  public String addNewCountry(@RequestBody Res res) {
    return countryService.addNewCountry(
      res.getCountryCode(),
      res.getCountryName()
    );
  }

  @GetMapping(path = "/all")
  public Iterable<TblCountry> getAllCountries() {
    return countryService.getAllCountries();
  }

  @PostMapping(path = "/select")
  public TblCountry select(@RequestParam String countryCode) {
    return countryService.select(countryCode);
  }

  @PostMapping(path = "/selectName")
  public List<TblCountry> selectName(@RequestParam String countryName) {
    return countryService.selectName(countryName);
  }
}
