package com.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DivTests extends BaseTest{

    @Test(dataProvider = "valuesForDivLongTest", groups = {"test1"})
    public void divLongTest(long a, long b, long expected){
        long result = calculator.div(a, b);
        Assert.assertEquals(result, expected, "div result was incorrect");
    }

    @Test(dataProvider = "valuesForDivDoubleTest", groups = {"test1"})
    public void divDoubleTest(double a, double b, double expected){
        double result = calculator.div(a, b);
        Assert.assertEquals(result, expected, "div result was incorrect");
    }

    @Test(groups = {"test1"})
    public void divByZeroLongPos(){
        double result = calculator.div(5, 0);
        Assert.assertEquals(result, Double.POSITIVE_INFINITY);
    }

    @Test
    public void divByZeroLongNeg(){
        double result = calculator.div(-5, 0);
        Assert.assertEquals(result, Double.NEGATIVE_INFINITY);
    }

    @Test
    public void divByZeroDoublePos(){
        double result = calculator.div(5.3, 0.0);
        Assert.assertEquals(result, Double.POSITIVE_INFINITY);
    }

    @Test
    public void divByZeroDoubleNeg(){
        double result = calculator.div(-5.3, 0.0);
        Assert.assertEquals(result, Double.NEGATIVE_INFINITY);
    }

    @DataProvider(name = "valuesForDivLongTest")
    public Object[][] valuesForDivLongTest(){
        return new Object[][]{
                {6, 3, 2},
                {0, 5, 0},
                {-7, 1, -7},
                {-5, -5, 1}
        };
    }

    @DataProvider(name = "valuesForDivDoubleTest")
    public Object[][] valuesForDivDoubleTest(){
        return new Object[][]{
                {2.1, 0.1, 21.0},
                {-5.0, -1.0, 5.0},
                {27.3, 3.0, 9.1}
        };
    }
}
