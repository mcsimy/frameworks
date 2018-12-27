package com.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SumTests extends BaseTest
{
    @Test(dataProvider = "valuesForSumLongTest")
    public void sumLongTest(long a, long b, long expected){
        long result = calculator.sum(a, b);
        Assert.assertEquals(result, expected, "sum of long result was incorrect");
    }

    @Test(dataProvider = "valuesForSumDoubleTest")
    public void sumDoubleTest(double a, double b, double expected){
        double result = calculator.sum(a, b);
        Assert.assertEquals(result, expected,"sum of double result was incorrect");
    }

    @DataProvider(name = "valuesForSumLongTest")
    public Object[][] valuesForLongSum(){
        return new Object[][]{
                {10, 23, 33},
                {10, -1, 9},
                {0, 0, 0},
                {-1, 10, 9}
        };
    }

    @DataProvider(name = "valuesForSumDoubleTest")
    public Object[][] valuesForDoubleSum(){
        return new Object[][]{
                {10.1, 0.9, 11.0},
                {-0.1, 0.1, 0.0},
                {2.3, -0.4, 1.9},
                {-0.99, -0.01, -1.0}
        };
    }
}
