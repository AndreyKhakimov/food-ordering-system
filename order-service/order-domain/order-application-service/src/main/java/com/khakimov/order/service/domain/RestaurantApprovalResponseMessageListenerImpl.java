package com.khakimov.order.service.domain;

import com.khakimov.order.service.domain.dto.message.RestaurantApprovalResponse;
import com.khakimov.order.service.domain.ports.input.message.listener.restauranrapproval.RestaurantApprovalResponseMessageListener;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;

@Slf4j
@Validated
@Service
public class RestaurantApprovalResponseMessageListenerImpl implements RestaurantApprovalResponseMessageListener {
    @Override
    public void orderApproved(RestaurantApprovalResponse restaurantApprovalResponse) {

    }

    @Override
    public void orderRejected(RestaurantApprovalResponse restaurantApprovalResponse) {

    }
}
