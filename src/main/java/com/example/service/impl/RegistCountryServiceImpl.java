package com.example.service.impl;

import com.example.entity.TblCountry;
import com.example.repository.TblCountryRepository;
import com.example.service.RegistCountryService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistCountryServiceImpl implements RegistCountryService {

  @Autowired
  private TblCountryRepository tblCountryRepository;

  @Override
  public String addNewCountry(String countryCode, String countryName) {
    System.out.println("addNewCountry called");

    TblCountry tblCountry = new TblCountry();
    tblCountry.setCountryCode(countryCode);
    tblCountry.setCountryName(countryName);
    tblCountryRepository.save(tblCountry);
    return "saved";
  }

  @Override
  public Iterable<TblCountry> getAllCountries() {
    System.out.println("getAllCountries called");
    return tblCountryRepository.findAll();
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
