package com.task_interv.dto.responseDTO;

import lombok.*;

import java.util.Collection;

@Data
@NoArgsConstructor
@Builder
@Setter
@Getter
public class PagingResult {

    private Collection content;
    private Integer totalPages;
    private long totalElements;
    private Integer size;
    private Integer page;
    private boolean empty;

    public PagingResult(Collection content, Integer totalPages, long totalElements, Integer size, Integer page, boolean empty) {
        this.content = content;
        this.totalPages = totalPages;
        this.totalElements = totalElements;
        this.size = size;
        this.page = page + 1;
        this.empty = empty;
    }
}
