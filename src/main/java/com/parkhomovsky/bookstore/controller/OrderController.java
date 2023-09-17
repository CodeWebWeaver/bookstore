package com.parkhomovsky.bookstore.controller;

import com.parkhomovsky.bookstore.dto.order.OrderPlaceRequestDto;
import com.parkhomovsky.bookstore.dto.order_item.OrderItemDto;
import com.parkhomovsky.bookstore.service.OrderService;
import io.swagger.v3.oas.annotations.tags.Tag;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/orders")
@Tag(name = "Orders management",
        description = "Endpoints for managing user orders")
public class OrderController {
    private OrderService orderService;

    @PostMapping("/place-order")
    @ResponseStatus(HttpStatus.OK)
    public List<OrderItemDto> placeOrder(@RequestBody OrderPlaceRequestDto orderPlaceRequestDto) {
        return orderService.process(orderPlaceRequestDto);
    }
}
