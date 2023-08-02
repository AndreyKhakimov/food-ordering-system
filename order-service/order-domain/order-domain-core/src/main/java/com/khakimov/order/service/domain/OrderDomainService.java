package com.khakimov.order.service.domain;

import com.khakimov.order.service.domain.entity.Order;
import com.khakimov.order.service.domain.entity.Restaurant;
import com.khakimov.order.service.domain.event.OrderCancelEvent;
import com.khakimov.order.service.domain.event.OrderCreateEvent;
import com.khakimov.order.service.domain.event.OrderPaidEvent;

import java.util.List;

public interface OrderDomainService {

    OrderCreateEvent validateAndInitiateOrder(Order order, Restaurant restaurant);

    OrderPaidEvent payOrder(Order order);

    void approveOrder(Order order);

    OrderCancelEvent cancelOrderPayment(Order order, List<String> failureMessages);

    void cancelOrder(Order order, List<String> failureMessages);
}
