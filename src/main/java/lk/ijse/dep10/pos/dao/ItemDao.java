package lk.ijse.dep10.pos.dao;

import lk.ijse.dep10.pos.model.Item;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemDao extends JpaRepository<Item, String> {
}
