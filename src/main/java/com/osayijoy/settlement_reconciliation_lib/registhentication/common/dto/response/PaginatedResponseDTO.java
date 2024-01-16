package com.osayijoy.settlement_reconciliation_lib.registhentication.common.dto.response;

import java.util.ArrayList;
import java.util.List;
import lombok.*;

/*
 * @author Oluwatobi Ogunwuyi
 * @createdOn Jul-04(Tue)-2023
 */
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class PaginatedResponseDTO<T> {
    private List<T> content = new ArrayList<>();
    private int currentPage;
    private long totalPages;
    private long totalItems;
    private Boolean isFirstPage;
    private Boolean isLastPage;
}
