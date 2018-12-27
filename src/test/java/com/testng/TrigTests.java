package com.testng;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static java.lang.Double.NaN;

public class TrigTests extends BaseTest {

    @Test(dataProvider = "sinTestValues")
    public void sinTest(double a, double expected){
        double result = calculator.sin(a);
        Assert.assertEquals(result, expected, "sin was incorrect");
    }

    @Test(dataProvider = "cosTestValues")
    public void cosTest(double a, double expected){
        double result = calculator.cos(a);
        Assert.assertEquals(result, expected, "cos was incorrect");
    }

    @Test(dataProvider = "tgTestValues")
    public void tgTest(double a, double expected){
        double result = calculator.tg(a);
        Assert.assertEquals(result, expected, "tg was incorrect");
    }
    @Test(dataProvider = "ctgTestValues")
    public void ctgTest(double a, double expected){
        double result = calculator.ctg(a);
        Assert.assertEquals(result, expected, "ctg was incorrect");
    }

    @DataProvider(name = "sinTestValues")
    public Object[][] sinTestValues(){
        return new Object[][]{
                {0.0, 0.0},
                {Math.PI, 0.0},
                {(Math.PI)/6, 0.5}
        };
    }

    @DataProvider(name = "cosTestValues")
    public Object[][] cosTestValues(){
        return new Object[][]{
                {0.0, 1.0},
                {Math.PI, -1.0},
                {(Math.PI)/2, 0.5}
        };
    }

    @DataProvider(name = "tgTestValues")
    public Object[][] tgTestValues(){
        return new Object[][]{
                {0.0, NaN},
                {Math.PI, 0.0},
                {(Math.PI)/6, 2.0}
        };
    }

    @DataProvider(name = "ctgTestValues")
    public Object[][] ctgTestValues(){
        return new Object[][]{
                {Math.PI/2, 0.0},
                {(Math.PI)/4, 1.0}
        };
    }
}
