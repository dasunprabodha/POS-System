package lk.ijse.dep10.pos.controller;

import lk.ijse.dep10.pos.model.Item;
import lk.ijse.dep10.pos.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@CrossOrigin
@Repository
@RequestMapping("/api/v1/items")
public class OrderController {

    @Autowired
    ItemService itemService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<String> saveItem(@RequestBody @Valid Item item){
        return  itemService.saveItem(item);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{itemCode}")
    public void deleteItem(@PathVariable("itemCode") String itemCode) {
        itemService.deleteItem(itemCode);
    }
    @GetMapping
    public List<Item> getItems(@RequestParam(value = "q", required = false)
                                       String query)  {
        if (query == null) query = "";
        return itemService.findItems(query);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("/{itemCode}")
    public void updateItem(@PathVariable("itemCode") String  itemCode,
                               @RequestBody @Valid Item item) {
        item.setCode(itemCode);
        itemService.updateItem(item);
    }
}
