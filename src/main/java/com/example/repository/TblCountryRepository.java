package com.example.repository;

import com.example.entity.TblCountry;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TblCountryRepository
  extends CrudRepository<TblCountry, Integer> {}
