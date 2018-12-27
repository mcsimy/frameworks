package com.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultTests extends BaseTest {

    @Test(dataProvider = "valuesForMultLongTest", groups = {"test1"})
    public void multLongTest(long a, long b, long expected){
        long result = calculator.mult(a, b);
        Assert.assertEquals(result, expected, "multip result was incorrect");
    }

    @Test(dataProvider = "valuesForMultDoubleTest")
    public void multDoubleTest(double a, double b, double expected){
        double result = calculator.mult(a, b);
        Assert.assertEquals(result, expected, "multip result was incorrect");
    }

    @DataProvider(name = "valuesForMultLongTest")
    public Object[][] valuesForMultLongTest(){
        return new Object[][]{
                {2, 3, 6},
                {5, 0, 0},
                {-1, 7, -7},
                {-5, -4, 20}
        };
    }

    @DataProvider(name = "valuesForMultDoubleTest")
    public Object[][] valuesForMultDoubleTest(){
        return new Object[][]{
                {2.1, 0.1, 0.21},
                {-0.1, 5.0, -0.5},
                {0.0, 5.7, 0.0}
        };
    }
}
