package lk.ijse.dep10.pos.service;

import lk.ijse.dep10.pos.dao.ItemDao;
import lk.ijse.dep10.pos.dao.OrderDao;
import lk.ijse.dep10.pos.model.Item;
import lk.ijse.dep10.pos.model.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    OrderDao orderDao;

    public ResponseEntity<String> saveOrder(Order order) {
        orderDao.save(order);
        return new ResponseEntity<>("success", HttpStatus.CREATED);

    }

    public List<Order> findOrders(String query) {
        return orderDao.findAll();
    }
}

