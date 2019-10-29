package com.example.tangoDemo.service;

import com.example.tangoDemo.pojo.CatalogResponse;
import com.example.tangoDemo.pojo.OrderHistoryResponse;
import com.example.tangoDemo.pojo.OrderRequest;
import com.example.tangoDemo.pojo.OrderResponse;

public interface TangoCardService {
    CatalogResponse catalogs();
    OrderResponse orderGiftCard(OrderRequest request);
    OrderHistoryResponse retrievePastOrder();
}
