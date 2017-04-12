package com.demo.service;

import com.demo.dao.CustomerDao;
import com.demo.domain.Customer;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ly on 2017/4/12
 */

@Transactional
public class CustomerServiceImpl implements CustomerService{

    private CustomerDao customerDao;

    public void setCustomerDao(CustomerDao customerDao) {
        this.customerDao = customerDao;
    }




    public void save(Customer customer){
        System.out.println("customerService save ....");
        customerDao.save(customer);
    }
}
