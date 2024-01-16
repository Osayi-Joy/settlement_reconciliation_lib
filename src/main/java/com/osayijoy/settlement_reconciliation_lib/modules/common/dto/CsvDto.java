package com.osayijoy.settlement_reconciliation_lib.modules.common.dto;

import com.osayijoy.settlement_reconciliation_lib.modules.common.util.AutomataSearchRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import lombok.Getter;
import lombok.Setter;

/**
 * @author Joy Osayi
 * @createdOn Dec-15(Fri)-2023
 */
@Getter
@Setter
public class CsvDto<T> {
    private AutomataSearchRequest automataSearchRequest;
    private HttpServletResponse response;
    private Map<String, Function<T, String>> fieldMappings = new HashMap<>();
    private String[] csvHeader;
    private String fileName;
    private List<T> data;
    private int page;
    private int pageSize;
}
