package com.example.service;

import com.example.entity.TblCountry;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public interface CountryService {
  public @ResponseBody String addNewCountry(
    @RequestParam String countryCode,
    @RequestParam String countryName
  );

  public @ResponseBody Iterable<TblCountry> getAllCountries();

  public @ResponseBody TblCountry select(@RequestParam String countryCode);

  public @ResponseBody List<TblCountry> selectName(
    @RequestParam String countryName
  );
}
