package com.naimish.SpringEcom.model.dto;

public record OrderItemRequest(
        int productId,
        int quantity
) {}
