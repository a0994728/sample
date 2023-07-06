package com.example.service.impl;

import com.example.entity.TblCountry;
import com.example.model.AddNewCountryRequestBody;
import com.example.model.AddNewCountryResponseBody;
import com.example.model.GetAllCountriesResponseBody;
import com.example.repository.TblCountryRepository;
import com.example.service.CountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImpl implements CountryService {

  @Autowired
  private TblCountryRepository tblCountryRepository;

  @Override
  public AddNewCountryResponseBody addNewCountry(AddNewCountryRequestBody req) {
    System.out.println("addNewCountry called");
    AddNewCountryResponseBody result = new AddNewCountryResponseBody();
    TblCountry tblCountry = new TblCountry();
    tblCountry.setCountryCode(req.getCountryCode());
    tblCountry.setCountryName(req.getCountryName());
    tblCountryRepository.save(tblCountry);

    result.setDetail("0");
    return result;
  }

  @Override
  public GetAllCountriesResponseBody getAllCountries() {
    GetAllCountriesResponseBody result = new GetAllCountriesResponseBody();
    System.out.println("getAllCountries called");
    List<TblCountry> req = tblCountryRepository.findAll();
    result.setListTblCountry(req);
    result.setNumberOfCountry(req.size());
    return result;
  }

  @Override
  public TblCountry select(String countryCode) {
    System.out.println("select called");
    TblCountry result = tblCountryRepository.findByCountryCode(countryCode);
    return result;
  }

  @Override
  public List<TblCountry> selectName(String countryName) {
    System.out.println("selectName called");
    List<TblCountry> result = tblCountryRepository.findByCountryName(
      countryName
    );
    return result;
  }
}
