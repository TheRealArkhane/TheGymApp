package com.gym;


import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public abstract class Person {

    //добавить validation
    protected String firstName;
    protected String lastname;

}
