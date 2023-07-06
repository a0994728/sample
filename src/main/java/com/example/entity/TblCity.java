package com.example.entity;

import jakarta.persistence.*;
import java.sql.*;
import lombok.Data;

@Data
@Entity(name = "com.example.entity.TblCity")
@Table(name = "tbl_city")
public class TblCity {

  @Id
  @Column(name = "\"city_id\"", nullable = false)
  private Integer cityId;

  @Column(name = "\"city_name\"", nullable = true)
  private String cityName;

  @Column(name = "\"country_code\"", nullable = false)
  private String countryCode;

  @Column(name = "\"district\"", nullable = true)
  private String district;

  @Column(name = "\"city_population\"", nullable = true)
  private Integer cityPopulation;

  @ManyToOne
  @JoinColumn(name = "`country_code`", insertable = false, updatable = false)
  private TblCountry tblCountry;
}
