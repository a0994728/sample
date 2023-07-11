package com.example.service;

import com.example.entity.TblCountryLanguage;
import com.example.model.DetailCityRequestBody;
import com.example.model.DetailCityResponseBody;
import java.util.List;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.ResponseBody;

@Service
public interface LanguageService {
  public List<TblCountryLanguage> findAllLanguages();
}
