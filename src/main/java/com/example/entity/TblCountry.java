package com.example.entity;

import jakarta.persistence.*;
import java.sql.*;
import lombok.Data;

@Data
@Entity(name = "com.example.entity.TblCountry")
@Table(name = "tbl_country")
public class TblCountry {

  @Id
  @Column(name = "\"country_code\"", nullable = false)
  private String countryCode;

  @Column(name = "\"country_name\"", nullable = false)
  private String countryName;

  @Column(name = "\"continent\"", nullable = false)
  private String continent;

  @Column(name = "\"region\"", nullable = false)
  private String region;

  @Column(name = "\"surface_area\"", nullable = false)
  private java.math.BigDecimal surfaceArea;

  @Column(name = "\"indep_year\"", nullable = true)
  private Short indepYear;

  @Column(name = "\"country_population\"", nullable = false)
  private Integer countryPopulation;

  @Column(name = "\"life_expectancy\"", nullable = true)
  private java.math.BigDecimal lifeExpectancy;

  @Column(name = "\"gnp\"", nullable = true)
  private java.math.BigDecimal gnp;

  @Column(name = "\"gnpold\"", nullable = true)
  private java.math.BigDecimal gnpold;

  @Column(name = "\"local_name\"", nullable = false)
  private String localName;

  @Column(name = "\"government_form\"", nullable = false)
  private String governmentForm;

  @Column(name = "\"head_of_state\"", nullable = true)
  private String headOfState;

  @Column(name = "\"capital\"", nullable = true)
  private Integer capital;

  @Column(name = "\"code2\"", nullable = false)
  private String code2;
}
