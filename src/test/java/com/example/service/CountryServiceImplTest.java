package com.example.service;

import com.example.repository.TblCountryRepository;
import org.junit.experimental.runners.Enclosed;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(Enclosed.class)
public class CountryServiceImplTest {

  @SpringBootTest
  public static class UnitTest {

    @MockBean
    TblCountryRepository tblCountryRepository;

    @Autowired
    CountryService countryService;
  }
}
