package com.junit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MultTestsDouble extends BaseTest {
    private double aDouble, bDouble, expectedDouble;
    private Calculator calculator;

    public MultTestsDouble(double aDouble, double bDouble, double expectedDouble){
        this.aDouble = aDouble;
        this.bDouble = bDouble;
        this.expectedDouble = expectedDouble;
    }

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @After
    public void deinit(){
        calculator = null;
    }

    @Test
    public void sumDoubleTest(){
        double result = calculator.mult(aDouble, bDouble);
        Assert.assertEquals(result, expectedDouble, 0.00001);
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> valuesForDoubleSum(){
        return Arrays.asList(new Object[][]{
                {2.1, 0.1, 0.21},
                {-0.1, 5.0, -0.5},
                {0.0, 5.7, 0.0}
        });
    }
}
