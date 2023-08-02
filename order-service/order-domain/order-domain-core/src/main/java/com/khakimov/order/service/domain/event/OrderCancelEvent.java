package com.khakimov.order.service.domain.event;

import com.khakimov.order.service.domain.entity.Order;

import java.time.ZonedDateTime;

public class OrderCancelEvent extends OrderEvent {

    public OrderCancelEvent(Order order, ZonedDateTime createdAt) {
        super(order, createdAt);
    }
}
