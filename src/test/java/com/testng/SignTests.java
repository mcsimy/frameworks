package com.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SignTests extends BaseTest {

    @Test(dataProvider = "isPositiveTestValues")
    public void isPositiveTest(long a, boolean expected){
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "isPositiveTestValues")
    public Object[][] cosTestValues(){
        return new Object[][]{
//                {0, Boolean.FALSE},
                {-1, Boolean.FALSE},
                {1, Boolean.TRUE}
        };
    }

    @Test(dataProvider = "isNegTestValues")
    public void isNegTest(long a, boolean expected){
        boolean result = calculator.isPositive(a);
        Assert.assertEquals(result, expected);
    }

    @DataProvider(name = "isNegTestValues")
    public Object[][] isNegTestValues(){
        return new Object[][]{
//                {0, Boolean.FALSE},
                {-1, Boolean.TRUE},
                {1, Boolean.FALSE}
        };
    }
}
