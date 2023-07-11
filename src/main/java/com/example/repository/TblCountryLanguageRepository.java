package com.example.repository;

import com.example.entity.TblCountry;
import com.example.entity.TblCountryLanguage;
import com.example.entity.TblCountryLanguage.PrimaryKeys;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TblCountryLanguageRepository
  extends JpaRepository<TblCountryLanguage, PrimaryKeys> {
  // public List<TblCountryLanguage> findAll();
}
