package com.osayijoy.settlement_reconciliation_lib.modules.common.util;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
public class PageableUtil {

  public static final String PAGE_SIZE_DEFAULT_VALUE = "10";
  public static final String PAGE_NUMBER_DEFAULT_VALUE = "0";
  public static final String PAGE_SIZE = "pageSize";
  public static final String PAGE_NUMBER = "pageNumber";
  public static final String SORT_BY_CREATED_DATE = "createdDate";
  public static final String START_DATE = "startDate";
  public static final String CREATED_DATE = "createdDate";
  public static final String END_DATE = "endDate";
  public static final String DOWNLOAD_FORMAT = "downloadFormat";
  public static final String STATUS = "status";
  public static final String KEY = "key";
  public static final String VALUE = "value";
  public static final String EMAIL = "email";
  public static final String DATE_FORMAT = "yyyy-MM-dd";


  public static final String REF_PREFIX = "REF_";

  public static final String PAGINATED = "paginated";
  public static final String PAGINATED_DEFAULT_VALUE = "false";
  public static final String ACTIVE = "active";
  public static final String ACTIVE_DEFAULT_VALUE = "true";
  public static final String ROLE_NAME = "roleName";
  public static final String DOWNLOAD_FORMAT_DEFAULT_VALUE = "csv";


  public static LocalDateTime dateChecker(String endDateStr, LocalDateTime startDate) {
    LocalDateTime endDate =
            LocalDate.parse(endDateStr, DateTimeFormatter.ofPattern(DATE_FORMAT))
                    .atTime(LocalTime.MAX);

    if (startDate.toLocalDate().isEqual(endDate.toLocalDate())) {
      endDate = endDate.plusDays(1);
    }
    return endDate;
  }


  public static Pageable getPageable(int page, int size){
    return getPageable(page,size,SORT_BY_CREATED_DATE);
  }

  public static Pageable getPageable(int page, int size, String sortBy){
    return PageRequest.of(
            Math.max(page - 1, 0),
            size,
            Sort.by(sortBy).descending());
  }
  public static LocalDateTime toStartOfDay(String date) {
    return LocalDate.parse(date).atStartOfDay();
  }
  public static LocalDateTime toEndOfDay(String date) {
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    return LocalDateTime.parse(date + " 23:59", formatter);
  }
  private PageableUtil() {}
}
