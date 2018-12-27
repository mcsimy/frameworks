package com.testng;

import org.testng.Assert;
import org.testng.annotations.*;

public class SubTests extends BaseTest {

    @Test(dataProvider = "valuesForSubLongTest", groups = "test1")
    public void subLongTest(long a, long b, long expected){
        long result = calculator.sub(a, b);
        Assert.assertEquals(result, expected, "sub of long result was incorrect");
    }

    @Test(dataProvider = "valuesForSubDoubleTest", groups = "test1")
    public void subDoubleTest(double a, double b, double expected){
        double result = calculator.sub(a, b);
        Assert.assertEquals(result, expected,"sub of double result was incorrect");
    }

    @DataProvider(name = "valuesForSubLongTest")
    public Object[][] valuesForLongSub(){
        return new Object[][]{
                {10, 23, -13},
                {10, -1, 11},
                {0, 0, 0},
                {-1, 10, -11}
        };
    }

    @DataProvider(name = "valuesForSubDoubleTest")
    public Object[][] valuesForDoubleSub(){
        return new Object[][]{
                {10.1, 0.9, 9.2},
                {-0.1, 0.1, -0.2},
                {2.3, -0.4, 2.7},
                {-0.99, -0.01, -0.98},
                {1, 0.1, 0.9}
        };
    }
}
