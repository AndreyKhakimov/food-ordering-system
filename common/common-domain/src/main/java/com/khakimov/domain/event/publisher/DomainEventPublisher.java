package com.khakimov.domain.event.publisher;

import com.khakimov.domain.event.DomainEvent;

public interface DomainEventPublisher<T extends DomainEvent>{

    void publish(T domainEvent);
}
