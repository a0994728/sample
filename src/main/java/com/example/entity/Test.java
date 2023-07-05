package com.example.entity;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "com.example.entity.Test")
@Table(name = "test")
public class Test {

  @Id
  @Column(name = "\"id\"", nullable = false)
  private Integer id;
  @Column(name = "\"name\"", nullable = true)
  private String name;
}