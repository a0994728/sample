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
          /**
           *  判定するための属性（root.getの引数）に、リクエストボディ内のcountryName前後に「%」を付与した文字列を設定する
           *  →「%」を消せば完全一致検索になる
           */

          return cb.like(root.get("countryName"), "%" + countryName + "%");
        }
      };
  }
}
