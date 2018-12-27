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
public class SumTestsLong extends BaseTest
{
    private long aLong, bLong, expectedLong;
    private Calculator calculator;

    public SumTestsLong(long aLong, long bLong, long expectedLong){
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
    public void sumLongTest(){
        long result = calculator.sum(aLong, bLong);
        Assert.assertEquals(result, expectedLong);
    }

    @Parameterized.Parameters
    public static Collection valuesForLongSum(){
        return Arrays.asList(new Object[][]{
                {10, 23, 33},
                {10, -1, 9},
                {0, 0, 0},
                {-1, 10, 9}
        });
    }
}
