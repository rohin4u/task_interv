package com.task_interv.pagination;

import com.task_interv.dto.requestDTO.PaginationTask;
import lombok.NoArgsConstructor;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;


@NoArgsConstructor
public class TaskPaginator {
    public static Pageable getPageableTask(PaginationTask request){
        return PageRequest.of(request.getPage(), request.getSize(), request.getDirection(), request.getSortField());
    }
}
