package com.example.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class DetailCityResponseBody {

  private String detail;
  private Integer cityId;

  private String cityName;

  private String countryCode;

  private String district;

  private Integer cityPopulation;

  private CountryInfo countryInfo;
}
