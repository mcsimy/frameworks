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
public class PowTests extends BaseTest {
    private double aDouble, bDouble, expectedDouble;
    private Calculator calculator;

    public PowTests(double aDouble, double bDouble, double expectedDouble){
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
        double result = calculator.pow(aDouble, bDouble);
        Assert.assertEquals(result, expectedDouble, 0.00001);
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> valuesForDoubleSum(){
        return Arrays.asList(new Object[][]{
                {2.0, 2.0, 4.0},
                {5.0, 0.0, 1.0},
                {0.0, 5.0, 0.0},
                {0.2, 0.2, 0.04},
                {2.0, -1.0, 0.5}
        });
    }
}
