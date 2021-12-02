package com.laioffer.laidemo1.service;

import com.laioffer.laidemo1.dao.CustomerDao;
import com.laioffer.laidemo1.entity.Record;
import com.laioffer.laidemo1.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    @Autowired
    private CustomerDao customerDao;

    public void signUp(Customer customer) {
        Record record = new Record();
        customer.setRecord(record);

        customer.setEnabled(true);
        customerDao.signUp(customer);
    }

    public Customer getCustomer(String email) {
        return customerDao.getCustomer(email);
    }

}

