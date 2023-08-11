package lk.ijse.dep10.pos.service;

import lk.ijse.dep10.pos.dao.ItemDao;
import lk.ijse.dep10.pos.model.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {
    @Autowired
    ItemDao itemDao;


    public ResponseEntity<String> saveItem(Item item) {
        itemDao.save(item);
        return new ResponseEntity<>("success", HttpStatus.CREATED);

    }

    public void deleteItem(String itemCode) {
        itemDao.deleteById(itemCode);
    }

    public List<Item> findItems(String query) {
        return itemDao.findAll();
    }


    public void updateItem(Item item) {
        itemDao.save(item);
    }
}
