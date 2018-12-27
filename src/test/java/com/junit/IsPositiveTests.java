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
public class IsPositiveTests extends BaseTest {
    private long a;
    private boolean expected;
    private Calculator calculator;

    public IsPositiveTests(long a, boolean expected){
        this.a = a;
        this.expected = expected;
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
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(expected, result);
    }

    @Parameterized.Parameters
    public static Iterable<Object[]> valuesForDoubleSum(){
        return Arrays.asList(new Object[][]{
                {0, Boolean.FALSE},
                {-1, Boolean.FALSE},
                {1, Boolean.TRUE}
        });
    }
}
