package com.example.service.impl;

import com.example.entity.TblCity;
import com.example.entity.TblCountry;
import com.example.model.CountryInfo;
import com.example.model.DetailCityRequestBody;
import com.example.model.DetailCityResponseBody;
import com.example.repository.TblCityRepository;
import com.example.service.CityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CityServiceImpl implements CityService {

  @Autowired
  private TblCityRepository tblCityRepository;

  @Override
  public DetailCityResponseBody selectDetailCity(DetailCityRequestBody req) {
    DetailCityResponseBody result = new DetailCityResponseBody();
    CountryInfo countryInfo = new CountryInfo();
    TblCity tblCity = tblCityRepository.findByCityId(req.getCityId());
    result.setCityId(tblCity.getCityId());
    result.setCityName(tblCity.getCityName());
    result.setCityPopulation(tblCity.getCityPopulation());
    result.setCountryCode(tblCity.getCountryCode());
    result.setDistrict(tblCity.getDistrict());

    TblCountry tblCountry = tblCity.getTblCountry();

    countryInfo.setCountryCode(tblCountry.getCountryCode());
    countryInfo.setCountryName(tblCountry.getCountryName());
    countryInfo.setIndepYear(tblCountry.getIndepYear());
    countryInfo.setRegion(tblCountry.getRegion());

    result.setCountryInfo(countryInfo);

    result.setDetail("0");
    return result;
  }
}
