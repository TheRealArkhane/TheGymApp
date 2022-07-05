package com.gym;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class TariffPlan {

    private String id;
    private String name;
    private double price;
    private String managerId;

    //функционал;
}
