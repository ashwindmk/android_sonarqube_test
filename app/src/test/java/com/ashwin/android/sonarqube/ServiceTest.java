package com.ashwin.android.sonarqube;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class ServiceTest {
    private Service service;

    @Before
    public void setUp() {
        service = new Service();
    }

    @Test
    public void addTest() {
        int res = service.add(3, 4);
        Assert.assertEquals(7, res);
    }

    @Test
    public void calculateSubTest() {
        int res = service.calculate("sub", 5, 2);
        Assert.assertEquals(3, res);
    }

    @Test
    public void calculateDivTest() {
        int res = service.calculate("div", 15, 3);
        Assert.assertEquals(0, res);
    }

//    @Test
//    public void calculateNullTest() {
//        int res = service.calculate(null, 15, 3);
//        Assert.assertEquals(-1, res);
//    }

    @Test
    public void calculateEmptyTest() {
        int res = service.calculate("", 15, 3);
        Assert.assertEquals(-1, res);
    }

    @Test
    public void positiveTest() {
        service.foo(2);
    }

    @Test
    public void negativeTest() {
        service.foo(-2);
    }

    @After
    public void tearDown() {
        service = null;
    }
}
