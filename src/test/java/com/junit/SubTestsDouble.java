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
public class SubTestsDouble extends BaseTest {
    private double aDouble, bDouble, expectedDouble;
    private Calculator calculator;

    public SubTestsDouble(double aDouble, double bDouble, double expectedDouble){
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
        double result = calculator.sub(aDouble, bDouble);
        Assert.assertEquals(result, expectedDouble, 0.00001);
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> valuesForDoubleSum(){
        return Arrays.asList(new Object[][]{
                {10.1, 0.9, 9.2},
                {-0.1, 0.1, -0.2},
                {2.3, -0.4, 2.7},
                {-0.99, -0.01, -0.98},
                {1, 0.1, 0.9}
        });
    }
}
