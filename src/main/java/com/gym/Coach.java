package com.gym;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Coach extends Person {

    //добавить validation
    private String id;
    private String sectionId;
    private String managerId;

    //функционал
}
