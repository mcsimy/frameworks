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
public class SqrtTests extends BaseTest {
    private double aDouble, expectedDouble;
    private Calculator calculator;

    public SqrtTests(double aDouble, double expectedDouble){
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
        double result = calculator.sqrt(aDouble);
        Assert.assertEquals(result, expectedDouble, 0.00001);
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> valuesForDoubleSum(){
        return Arrays.asList(new Object[][]{
                {4.0, 2.0},
                {0.0, 0.0},
                {0.04, 0.2}
        });
    }
}
