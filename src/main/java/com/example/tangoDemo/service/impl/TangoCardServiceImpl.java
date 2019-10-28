package com.example.tangoDemo.service.impl;

import com.example.tangoDemo.pojo.CatalogResponse;
import com.example.tangoDemo.pojo.OrderResponse;
import com.example.tangoDemo.service.TangoCardService;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

public class TangoCardServiceImpl implements TangoCardService {

    private RestTemplate restTemplate = new RestTemplate();
    private String  tangoCardBaseUrl = "https://integration-api.tangocard.com/raas/v2/";

    public TangoCardServiceImpl(){
        restTemplate.getInterceptors().add(new BasicAuthenticationInterceptor("ZeMoSo Sandbox","dh$w!fiFuNtsVeNeuPuS!QOyvOncdLVwvtHdgVAcsU$UI"));
    }

    @Override
    public String catalogs(){
        CatalogResponse cr =restTemplate.getForObject(tangoCardBaseUrl + "catalogs", CatalogResponse.class);
        System.out.println(cr);
        return "hi";
    }

    @Override
    public String orderGiftCard(){
        return "test";
    }
}
