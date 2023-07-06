package com.example.service;

import com.example.model.DetailCityRequestBody;
import com.example.model.DetailCityResponseBody;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public interface CityService {
  public @ResponseBody DetailCityResponseBody selectDetailCity(
    DetailCityRequestBody req
  );
}
