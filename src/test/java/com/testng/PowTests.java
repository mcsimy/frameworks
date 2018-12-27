package com.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PowTests extends BaseTest {

    @Test(dataProvider = "powTestValues")
    public void powTest(double a, double b, double expected){
        double result = calculator.pow(a, b);
        Assert.assertEquals(result, expected, "power was incorrect");
    }

    @DataProvider(name = "powTestValues")
    public Object[][] powTestValues(){
         return new Object[][]{
                 {2.0, 2.0, 4.0},
                 {5.0, 0.0, 1.0},
                 {0.0, 5.0, 0.0},
                 {0.2, 0.2, 0.04},
                 {2.0, -1.0, 0.5}
         };
    }
}
