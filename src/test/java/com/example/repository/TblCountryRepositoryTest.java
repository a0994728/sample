package com.example.repository;

import static org.junit.Assert.assertEquals;

import com.example.entity.TblCountry;
import java.math.BigDecimal;
import java.util.List;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@DataJpaTest
public class TblCountryRepositoryTest {

  @Autowired
  private TestEntityManager testEntityManager;

  @Autowired
  private TblCountryRepository tblCountryRepository;

  @Before
  public void beforeEach() {
    TblCountry country = new TblCountry();
    country.setCountryCode("ABW");
    country.setCountryCode("Aruba ");
    country.setContinent("North America");
    country.setRegion("Caribbean");
    country.setSurfaceArea(new BigDecimal(193));
    country.setIndepYear(null);
    country.setCountryPopulation(103000);
    country.setLifeExpectancy(new BigDecimal("78.4"));
    country.setGnp(new BigDecimal("828.00"));
    country.setGnpold(new BigDecimal("793.00"));
    country.setLocalName("Aruba");
    country.setGovernmentForm("Nonmetropolitan Territory of The Netherlands");
    country.setHeadOfState("Beatrix ");
    country.setCapital(129);
    country.setCode2("AW");
    testEntityManager.persist(
      country
      // TblCountry
      //   .builder()
      //   .setcountryCode("ABW")
      //   .setcountryName("Aruba ")
      //   .setcontinent("North America")
      //   .setregion("Caribbean")
      //   .setsurfaceArea(new BigDecimal(193))
      //   .setindepYear(null)
      //   .setcountryPopulation(103000)
      //   .setlifeExpectancy(new BigDecimal("78.4"))
      //   .setgnp(new BigDecimal("828.00"))
      //   .setgnpold(new BigDecimal("793.00"))
      //   .setlocalName("Aruba")
      //   .setgovernmentForm("Nonmetropolitan Territory of The Netherlands")
      //   .setheadOfState("Beatrix ")
      //   .setcapital(129)
      //   .setcode2("AW")
      //   .build()

    );
  }

  @Test
  public void findAllTest() {
    List<TblCountry> result = tblCountryRepository.findAll();
    assertEquals(result.size(), 1);
    assertEquals(result.get(0).getCountryCode(), "ABW");
  }
}
