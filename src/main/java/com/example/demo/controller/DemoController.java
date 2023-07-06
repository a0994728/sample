package com.example.demo.controller;

import com.example.entity.TblCountry;
import com.example.model.AddNewCountryRequestBody;
import com.example.model.AddNewCountryResponseBody;
import com.example.model.DetailCityRequestBody;
import com.example.model.DetailCityResponseBody;
import com.example.model.GetAllCountriesResponseBody;
import com.example.service.CityService;
import com.example.service.CountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/demo")
public class DemoController {

  @Autowired
  private CountryService countryService;

  @Autowired
  private CityService cityService;

  @PostMapping(path = "/add", consumes = "application/json")
  public AddNewCountryResponseBody addNewCountry(
    @RequestBody AddNewCountryRequestBody req
  ) {
    return countryService.addNewCountry(req);
  }

  @GetMapping(path = "/all")
  public GetAllCountriesResponseBody getAllCountries() {
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

  @PostMapping(path = "/detail_city", consumes = "application/json")
  public DetailCityResponseBody selectDetailCity(
    @RequestBody DetailCityRequestBody req
  ) {
    return cityService.selectDetailCity(req);
  }
}
