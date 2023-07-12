package com.example.repository;

import com.example.entity.TblCountry;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TblCountryRepository
  extends
    JpaRepository<TblCountry, Integer>, JpaSpecificationExecutor<TblCountry> {
  public TblCountry findByCountryCode(String countryCode);

  /**
   * public List<TblCountry> findByCountryName(String countryName);に@Queryを付与する
   * JPQL内の「:countryName」は@Param("countryName")を付与した引数で紐づける
   *
   */
  @Query("SELECT c FROM TblCountry c WHERE c.countryName = :countryName")
  public List<TblCountry> findByCountryName(
    @Param("countryName") String countryName
  );
}
