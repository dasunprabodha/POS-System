package lk.ijse.dep10.pos.dao;

import lk.ijse.dep10.pos.model.Item;
import lk.ijse.dep10.pos.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderDao extends JpaRepository<Order, Integer> {
}
