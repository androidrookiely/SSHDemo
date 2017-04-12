package com.demo.dao;

import com.demo.domain.Customer;
import org.springframework.orm.hibernate5.support.HibernateDaoSupport;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by ly on 2017/4/12
 */

public class CustomerDaoImpl extends HibernateDaoSupport implements  CustomerDao {
    @Override
    public void save(Customer customer) {
        System.out.println("customerDao save ...");
        getHibernateTemplate().save(customer);
    }
}
