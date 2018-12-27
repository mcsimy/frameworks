package com.junit;

import com.epam.tat.module4.Calculator;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DivByZeroChecks {

    Calculator calculator;

    @Before
    public void init(){
        calculator = new Calculator();
    }

    @After
    public void deinit(){
        calculator = null;
    }

    @Test
    public void divByZeroLongPos(){
        double result = calculator.div(5, 0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, result);
    }

    @Test
    public void divByZeroLongNeg() {
        double result = calculator.div(-5, 0);
        Assert.assertEquals(Double.POSITIVE_INFINITY, result);
    }
    @Test
        public void divByZeroDoublePos(){
            double result = calculator.div(5.3, 0.0);
            Assert.assertEquals(result, Double.POSITIVE_INFINITY, 0.0000001);
        }

        @Test
        public void divByZeroDoubleNeg(){
            double result = calculator.div(-5.3, 0.0);
            Assert.assertEquals(result, Double.NEGATIVE_INFINITY, 0.0000001);
        }
}
