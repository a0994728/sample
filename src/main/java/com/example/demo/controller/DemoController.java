package com.example.demo.controller;

import com.example.entity.TblCountry;
import com.example.service.RegistCountryService;
import java.util.List;
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
  private RegistCountryService registCountryService;

  @PostMapping(path = "/add")
  public @ResponseBody String addNewCountry(
    @RequestParam String countryCode,
    @RequestParam String countryName
  ) {
    return registCountryService.addNewCountry(countryCode, countryName);
  }

  @GetMapping(path = "/all")
  public @ResponseBody Iterable<TblCountry> getAllCountries() {
    return registCountryService.getAllCountries();
  }

  @PostMapping(path = "/select")
  public @ResponseBody TblCountry select(@RequestParam String countryCode) {
    return registCountryService.select(countryCode);
  }

  @PostMapping(path = "/selectName")
  public @ResponseBody List<TblCountry> selectName(
    @RequestParam String countryName
  ) {
    return registCountryService.selectName(countryName);
  }
}
