package lk.ijse.dep10.pos.controller;

import io.swagger.annotations.ApiParam;
import io.swagger.annotations.Authorization;
import lk.ijse.dep10.pos.model.Customer;
import lk.ijse.dep10.pos.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("api/v1/customers")
@CrossOrigin
public class CustomerController {
    @Autowired
    CustomerService customerService;
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping
    public ResponseEntity<String> saveCustomer(@RequestBody @Valid Customer customer){
        return  customerService.saveCustomer(customer);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @DeleteMapping("/{customerId}")
    public void deleteCustomer(@PathVariable("customerId") Integer customerId) {
        customerService.deleteCustomerById(customerId);
    }
    @ResponseStatus(HttpStatus.NO_CONTENT)
    @PatchMapping("/{customerId}")
    public void updateCustomer(@PathVariable("customerId") Integer customerId,
                               @RequestBody @Valid Customer customer) throws Exception {
        customer.setId(customerId);
        customerService.updateCustomer(customer);
    }
    @GetMapping
    public List<Customer> getCustomers(@RequestParam(value = "q", required = false)
                                          String query)  {
        if (query == null) query = "";
        return customerService.findCustomers(query);
    }
}
