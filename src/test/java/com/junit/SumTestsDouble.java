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
public class SumTestsDouble extends BaseTest {
    private double aDouble, bDouble, expectedDouble;
    private Calculator calculator;

    public SumTestsDouble(double aDouble, double bDouble, double expectedDouble){
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
        double result = calculator.sum(aDouble, bDouble);
        Assert.assertEquals(result, expectedDouble, 0.00001);
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> valuesForDoubleSum(){
        return Arrays.asList(new Object[][]{
                {10.1f, 0.9f, 11.0f},
                {-0.1f, 0.1f, 0.0f},
                {2.3f, -0.4f, 1.9f},
                {-0.99f, -0.01f, -1.0f}
        });
    }
}
