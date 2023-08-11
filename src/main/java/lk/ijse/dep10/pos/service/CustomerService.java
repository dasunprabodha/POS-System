package lk.ijse.dep10.pos.service;

import lk.ijse.dep10.pos.dao.CustomerDao;
import lk.ijse.dep10.pos.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerDao customerDao;
    public ResponseEntity<String> saveCustomer(Customer customer) {
        customerDao.save(customer);
        return new ResponseEntity<>("success", HttpStatus.CREATED);

    }

    public void deleteCustomerById(Integer customerId) {
        customerDao.deleteById(customerId);
    }

    public void updateCustomer(Customer customer) {
        customerDao.save(customer);
    }

    public List<Customer> findCustomers(String query) {
        return customerDao.findAll();
    }
}
