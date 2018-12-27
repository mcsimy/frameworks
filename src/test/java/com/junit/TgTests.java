package com.junit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;

import static java.lang.Double.NaN;

@RunWith(Parameterized.class)
public class TgTests {
    private double aDouble, expectedDouble;
    private Calculator calculator;

    public TgTests(double aDouble, double expectedDouble){
        this.aDouble = aDouble;
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
        double result = calculator.tg(aDouble);
        Assert.assertEquals(result, expectedDouble, 0.00001);
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> valuesForDoubleSum(){
        return Arrays.asList(new Object[][]{
                {0.0, NaN},
                {Math.PI, 0.0},
                {(Math.PI)/6, 2.0}
        });
    }
}
