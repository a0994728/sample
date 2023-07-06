package com.example.model;

import com.example.entity.TblCountry;
import java.util.List;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class GetAllCountriesResponseBody {

  private String detail;

  private Integer numberOfCountry;

  private List<TblCountry> listTblCountry;
}
