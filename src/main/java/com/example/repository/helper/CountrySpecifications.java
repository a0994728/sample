package com.example.repository.helper;

import com.example.entity.TblCountry;
import com.example.model.GetAllCountriesRequestBody;
import io.micrometer.common.util.StringUtils;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.jpa.domain.Specification;

// @AllArgsConstructor
// @Builder
// @Data
public class CountrySpecifications {

  // private GetAllCountriesRequestBody getAllCountriesRequestBody;

  public static Specification<TblCountry> countryNameContains(
    String countryName
  ) {
    return StringUtils.isEmpty(countryName)
      ? null
      : new Specification<TblCountry>() {
        @Override
        public Predicate toPredicate(
          Root<TblCountry> root,
          CriteriaQuery<?> query,
          CriteriaBuilder cb
        ) {
          return cb.like(root.get("countryName"), "%" + countryName + "%");
        }
      };
  }
}
