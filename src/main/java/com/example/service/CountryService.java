package com.example.service;

import com.example.entity.TblCountry;
import com.example.model.AddNewCountryRequestBody;
import com.example.model.AddNewCountryResponseBody;
import com.example.model.GetAllCountriesRequestBody;
import com.example.model.GetAllCountriesResponseBody;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public interface CountryService {
  public @ResponseBody AddNewCountryResponseBody addNewCountry(
    AddNewCountryRequestBody req
  );

  public @ResponseBody GetAllCountriesResponseBody getAllCountries(
    @RequestBody GetAllCountriesRequestBody req
  );

  public @ResponseBody TblCountry select(@RequestParam String countryCode);

  public @ResponseBody List<TblCountry> selectName(
    @RequestParam String countryName
  );
}
