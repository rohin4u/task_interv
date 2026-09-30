package com.task_interv.dto.responseDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

import java.math.BigInteger;


@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskResponse {

    Integer id;
    String title;
    String description;
    boolean completed;

}
