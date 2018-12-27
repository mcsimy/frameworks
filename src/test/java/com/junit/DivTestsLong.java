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
public class DivTestsLong extends BaseTest
{
    private long aLong, bLong, expectedLong;
    private Calculator calculator;

    public DivTestsLong(long aLong, long bLong, long expectedLong){
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
        long result = calculator.div(aLong, bLong);
        Assert.assertEquals(expectedLong, result);
    }

    @Parameterized.Parameters
    public static Collection valuesForLongSum(){
        return Arrays.asList(new Object[][]{
                {6, 3, 2},
                {0, 5, 0},
                {-7, 1, -7},
                {-5, -5, 1}
        });
    }
}
