package com.example.entity;

import jakarta.persistence.*;
import java.io.Serializable;
import java.sql.*;
import lombok.Data;

@Data
@Entity
@Table(name = "tbl_country_language")
@IdClass(TblCountryLanguage.PrimaryKeys.class)
public class TblCountryLanguage implements Serializable {

  @Data
  public static class PrimaryKeys implements Serializable {

    private String countryCode;
    private String language;
  }

  @Id
  @Column(name = "\"country_code\"", nullable = false)
  private String countryCode;

  @Id
  @Column(name = "\"language\"", nullable = false)
  private String language;

  @Column(name = "\"is_official\"", nullable = true)
  private String isOfficial;

  @Column(name = "\"percentage\"", nullable = true)
  private java.math.BigDecimal percentage;
}
