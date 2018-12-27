package com.junit;

import com.epam.tat.module4.Calculator;
import org.junit.*;

public abstract class BaseTest {
    public Calculator calculator;

    @BeforeClass
    public void init(){
        calculator = new Calculator();
    }

    @AfterClass
    public void deinit(){
        calculator = null;
    }
}
