package com.example.repository;

import com.example.entity.TblCountry;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface TblCountryRepository
  extends
    JpaRepository<TblCountry, Integer>, JpaSpecificationExecutor<TblCountry> {
  public TblCountry findByCountryCode(String countryCode);

  public List<TblCountry> findByCountryName(String countryName);
}
