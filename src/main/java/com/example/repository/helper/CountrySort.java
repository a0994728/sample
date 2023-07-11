package com.example.repository.helper;

import com.example.model.GetAllCountriesRequestBody;
import org.springframework.data.domain.Sort;
import org.springframework.util.StringUtils;

public class CountrySort {

  public static Sort createSort(GetAllCountriesRequestBody req) {
    // １番目のソート項目が未設定の場合はデフォルトソート
    if (StringUtils.hasLength(req.getFirstSort())) {
      // sortTypeが0の時は昇順
      if (StringUtils.matchesCharacter(req.getSortType(), '0')) {
        return switchSort(
          Sort.Direction.ASC,
          req.getFirstSort(),
          req.getSecondSort()
        );
      } else if (StringUtils.matchesCharacter(req.getSortType(), '1')) {
        return switchSort(
          Sort.Direction.DESC,
          req.getFirstSort(),
          req.getSecondSort()
        );
      }
    }
    // sortTypeが0でも1でもないときはデフォルトソート
    return null;
  }

  private static Sort switchSort(
    Sort.Direction sortDirection,
    String firstSort,
    String secondSort
  ) {
    if (StringUtils.hasLength(secondSort)) {
      return Sort.by(sortDirection, firstSort, secondSort);
    }
    return Sort.by(sortDirection, firstSort);
  }
}
