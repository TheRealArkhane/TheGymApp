package com.gym;

import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;

@Data
@RequiredArgsConstructor
public class Visitor extends Person {

    //добавить validation
    private final String id;
    private String tpId;
    private String visitId;
    private LocalDateTime validityEndingTime;

    //функционал
}
