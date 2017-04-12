package com.demo.web.action;

import com.demo.domain.Customer;
import com.demo.service.CustomerService;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

/**
 * Created by ly on 2017/4/11
 */
public class CustomerAction extends ActionSupport implements ModelDriven<Customer>{


    private Customer customer;

    public void setCustomerService(CustomerService customerService) {
        this.customerService = customerService;
    }

    private CustomerService customerService;

    public String add(){
        System.out.println("action add...");
        System.out.println(customer);
        customerService.save(customer);
        return NONE;
    }

    @Override
    public Customer getModel() {
        customer = new Customer();
        return customer;
    }
}
