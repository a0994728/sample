package com.example.service.impl;

import com.example.entity.TblCity;
import com.example.entity.TblCountry;
import com.example.entity.TblCountryLanguage;
import com.example.model.CountryInfo;
import com.example.model.DetailCityRequestBody;
import com.example.model.DetailCityResponseBody;
import com.example.repository.TblCityRepository;
import com.example.repository.TblCountryLanguageRepository;
import com.example.service.CityService;
import com.example.service.LanguageService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LanguageServiceImpl implements LanguageService {

  @Autowired
  TblCountryLanguageRepository tblCountryLanguageRepository;

  @Override
  public List<TblCountryLanguage> findAllLanguages() {
    return tblCountryLanguageRepository.findAll();
  }
}
