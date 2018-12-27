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
public class MultTestsLong extends BaseTest
{
    private long aLong, bLong, expectedLong;
    private Calculator calculator;

    public MultTestsLong(long aLong, long bLong, long expectedLong){
        this.aLong = aLong;
        this.bLong = bLong;
        this.expectedLong = expectedLong;
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
    public void divLongTest(){
        long result = calculator.mult(aLong, bLong);
        Assert.assertEquals(expectedLong, result);
    }

    @Parameterized.Parameters
    public static Collection valuesForLongSum(){
        return Arrays.asList(new Object[][]{
                {2, 3, 6},
                {5, 0, 0},
                {-1, 7, -7},
                {-5, -4, 20}
        });
    }
}
