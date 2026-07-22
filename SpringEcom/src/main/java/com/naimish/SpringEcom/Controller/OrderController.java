package com.naimish.SpringEcom.Controller;

import com.naimish.SpringEcom.model.Order;
import com.naimish.SpringEcom.model.dto.OrderRequest;
import com.naimish.SpringEcom.model.dto.OrderResponse;
import com.naimish.SpringEcom.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/orders")
@CrossOrigin
public class OrderController {
    @Autowired
    private OrderService orderService;

    @PostMapping("/place")
    public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest){
        OrderResponse orderResponse = orderService.placeOrder(orderRequest);
        return new ResponseEntity<>(orderResponse, HttpStatus.CREATED);
    }

    @GetMapping("")
    public ResponseEntity<List<OrderResponse>> placeOrder(){
        List<OrderResponse> responses = orderService.getAllOrderResponses();
        return new ResponseEntity<>(responses, HttpStatus.OK);
    }
}
