package com.task_interv.dto.requestDTO;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@FieldDefaults(level = AccessLevel.PRIVATE)
public class TaskRequest {

    String title;
    String description;
    boolean completed;

}
