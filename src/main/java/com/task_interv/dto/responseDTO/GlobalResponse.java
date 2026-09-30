package com.task_interv.dto.responseDTO;


import lombok.*;
import lombok.experimental.FieldDefaults;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class GlobalResponse<T> {

    T data;
    String message;

}
