package com.task_interv.dto.requestDTO;


import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Sort;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class PageinationRequestDTO {

    int page;
    int size;
    String sortField;
    Sort.Direction direction;
}
