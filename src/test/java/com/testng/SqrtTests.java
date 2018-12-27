package com.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SqrtTests extends BaseTest {

    @Test(dataProvider = "sqrtTestValues")
    public void sqrtTest(double a, double expected){
        double result = calculator.sqrt(a);
        Assert.assertEquals(result, expected, "square root was incorrect");
    }

//    @Test
//    public void sqrtOfNegativeNumber(){
//        double result = calculator.sqrt(-1);
//        Assert.assertEquals(result, expected, "square root was incorrect");
//    }

    @DataProvider(name = "sqrtTestValues")
    public Object[][] sqrtTestValues(){
        return new Object[][]{
                {4.0, 2.0},
                {0.0, 0.0},
                {0.04, 0.2}
        };
    }
}
