package com.testng;

import com.epam.tat.module4.Calculator;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

public abstract class BaseTest {
    public Calculator calculator;

    @BeforeClass
    public void init()
    {
        calculator = new Calculator();
    }

    @AfterClass
    public void tearDown(){
        calculator = null;
    }
}
