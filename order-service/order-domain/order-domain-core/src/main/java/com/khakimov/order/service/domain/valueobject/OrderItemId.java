package com.khakimov.order.service.domain.valueobject;

import com.khakimov.domain.valueobject.BaseId;

public class OrderItemId extends BaseId<Long> {
    public OrderItemId(Long value) {
        super(value);
    }
}
