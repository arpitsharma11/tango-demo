package com.example.tangoDemo.service;

import com.example.tangoDemo.pojo.Email;
import com.example.tangoDemo.pojo.OrderRequest;
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
    public void catalogsLength(){
        Assert.assertNotEquals(0,tangoCardService.catalogs().getBrands().length);
    }

    @Test()
    public void catalogsName(){
        Assert.assertEquals("ZeMoSo Sandbox45081bed-b52b-4344-b7c6-bcfc17977fe2"
                ,tangoCardService.catalogs().getCatalogName());
    }

    @Test()
    public void createOrderAmount(){
        OrderRequest request = new OrderRequest();
        request.setAccountIdentifier("zemosoaccount1");
        request.setAmount((float) 1);
        request.setCustomerIdentifier("zemosocustomer1");
        request.setEmailSubject("Your Gift card from unit test");
        request.setEtid("E000000");
        request.setMessage("Hello test msg");
        request.setRecipient(new Email("arpit1282@gmail.com",
                "firstName",
                "lastName"));
        request.setSendEmail(true);
        request.setSender(new Email("arpit1282@gmail.com",
                "firstName",
                "lastName"));
        request.setUtid("U666425");

        Assert.assertEquals("1.0",
                tangoCardService.orderGiftCard(request).getAmountCharged().getValue());
    }

    @Test()
    public void createOrderName(){
        OrderRequest request = new OrderRequest();
        request.setAccountIdentifier("zemosoaccount1");
        request.setAmount((float) 1);
        request.setCustomerIdentifier("zemosocustomer1");
        request.setEmailSubject("Your Gift card from unit test");
        request.setEtid("E000000");
        request.setMessage("Hello test msg");
        request.setRecipient(new Email("arpit1282@gmail.com",
                "firstName",
                "lastName"));
        request.setSendEmail(true);
        request.setSender(new Email("arpit1282@gmail.com",
                "firstName",
                "lastName"));
        request.setUtid("U666425");

        Assert.assertEquals("Amazon.com Gift Card",
                tangoCardService.orderGiftCard(request).getRewardName());
    }

    public void OrderHistoryLength(){
        Assert.assertNotEquals((float) 0,tangoCardService.retrievePastOrder().getOrders().length);
    }
}
