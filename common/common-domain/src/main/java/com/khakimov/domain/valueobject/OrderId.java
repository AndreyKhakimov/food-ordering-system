package com.khakimov.domain.valueobject;

import java.util.UUID;

public abstract class OrderId extends BaseId<UUID> {
    public OrderId(UUID value) {
        super(value);
    }
}