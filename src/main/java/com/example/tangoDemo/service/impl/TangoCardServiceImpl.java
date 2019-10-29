package com.example.tangoDemo.service.impl;

import com.example.tangoDemo.pojo.*;
import com.example.tangoDemo.service.TangoCardService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.http.client.support.BasicAuthenticationInterceptor;
import org.springframework.web.client.RestTemplate;

public class TangoCardServiceImpl implements TangoCardService {

    private RestTemplate restTemplate = new RestTemplate();
    private String  tangoCardBaseUrl = "https://integration-api.tangocard.com/raas/v2/";

    public TangoCardServiceImpl(){
        restTemplate.getInterceptors().add(new BasicAuthenticationInterceptor("ZeMoSo Sandbox","dh$w!fiFuNtsVeNeuPuS!QOyvOncdLVwvtHdgVAcsU$UI"));
    }

    @Override
    public CatalogResponse catalogs(){
        CatalogResponse response =restTemplate.getForObject(tangoCardBaseUrl + "catalogs", CatalogResponse.class);

        return response;
    }

    @Override
    public OrderResponse orderGiftCard(OrderRequest request){
        HttpHeaders headers = new HttpHeaders();
        headers.setContentType(MediaType.APPLICATION_JSON);

        ObjectMapper mappper = new ObjectMapper();

        try {
            String requestJson = mappper.writeValueAsString(request);
                HttpEntity<String> entity = new HttpEntity<String>(requestJson, headers);
                ResponseEntity<OrderResponse> res = restTemplate.postForEntity(tangoCardBaseUrl + "orders",entity,OrderResponse.class);

                return res.getBody();
                //return res;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public OrderHistoryResponse retrievePastOrder(){
        OrderHistoryResponse res = restTemplate.getForObject(tangoCardBaseUrl + "orders",OrderHistoryResponse.class);
        return res;
    }
}
