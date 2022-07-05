package com.gym;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class Manager extends Person {

    //добавить validation
    private String id;
    private String tpId;
    private double planValue;
    private double revenueValue;

    //функционал
}
