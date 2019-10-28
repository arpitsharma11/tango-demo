package com.example.tangoDemo.service;

import com.example.tangoDemo.service.impl.TangoCardServiceImpl;
import org.springframework.boot.test.context.SpringBootTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TangoServiceTest {
    private TangoCardService tangoCardService;


    @Before()
    public void init(){
        tangoCardService = new TangoCardServiceImpl();
    }

    @Test()
    public void testFunc(){
        Assert.assertEquals("hi",tangoCardService.catalogs());
    }

}
