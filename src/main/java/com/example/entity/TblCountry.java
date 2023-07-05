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
}
