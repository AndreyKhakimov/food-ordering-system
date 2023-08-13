package com.khakimov.order.service.domain.ports.output.message.publisher.payment;

import com.khakimov.domain.event.publisher.DomainEventPublisher;
import com.khakimov.order.service.domain.event.OrderPaidEvent;

public interface OrderPaidRestaurantRequestMessagePublisher extends DomainEventPublisher<OrderPaidEvent> {
}
