package com.wzy.service.impl;

import com.wzy.service.OrderService;
import org.springframework.stereotype.Service;

@Service("orderService")
public class OrderServiceImpl implements OrderService {
    public void get() {
        System.out.println("OrderServiceImpl get...");
    }
}
