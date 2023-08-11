package lk.ijse.dep10.pos.controller;

import lk.ijse.dep10.pos.model.Item;
import lk.ijse.dep10.pos.model.Order;
import lk.ijse.dep10.pos.service.ItemService;
import lk.ijse.dep10.pos.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@Repository
@RequestMapping("/api/v1/orders")
public class OrderController {

    @Autowired
    OrderService orderService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<String> saveOrder(@RequestBody @Valid Order order){
        return  orderService.saveOrder(order);
    }

    @GetMapping
    public List<Order> getOrders(@RequestParam(value = "q", required = false)
                               String query)  {
        if (query == null) query = "";
        return orderService.findOrders(query);
    }
}
