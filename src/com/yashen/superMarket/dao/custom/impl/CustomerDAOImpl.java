/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 04:33 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.dao.custom.impl;

import com.yashen.superMarket.dao.custom.CustomerDAO;
import com.yashen.superMarket.entity.Customer;
import com.yashen.superMarket.util.db.FactoryConfiguration;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerDAOImpl implements CustomerDAO {
    @Override
    public Customer save(Customer customer, Session session) throws SQLException, ClassNotFoundException {
        try {
            long id = (long) session.save(customer);
            customer.setId(id);
            return customer;
        } catch (Exception e) {
            System.out.println("Customer Not Saved! , " + e.getMessage());
            return null;
        }
    }

    @Override
    public Customer update(Customer customer, Session session) throws SQLException, ClassNotFoundException {
        try {
            session.update(customer);
            return session.get(Customer.class, customer.getId());
        } catch (Exception e) {
            System.out.println("Customer Not Updated! , " + e.getMessage());
            return null;
        }
    }

    @Override
    public Customer delete(Customer customer, Session session) throws SQLException, ClassNotFoundException {
        try {
            Customer deletedCustomer = session.get(Customer.class, customer.getId());
            session.delete(customer);
            return deletedCustomer;
        } catch (Exception e) {
            System.out.println("Customer Not Deleted! , " + e.getMessage());
            return null;
        }
    }

    @Override
    public ArrayList<Customer> getAll(Session session) throws SQLException, ClassNotFoundException {
        try {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Customer> criteria = builder.createQuery(Customer.class);
            criteria.from(Customer.class);
            ArrayList<Customer> data = (ArrayList<Customer>) session.createQuery(criteria).getResultList();
            return data;
        } catch (Exception e) {
            System.out.println("Customer Not Lorded! , " + e.getMessage());
            return null;
        }
    }

    @Override
    public Customer getCustomer(Customer customer, Session session) throws SQLException, ClassNotFoundException {
        try {
            return session.get(Customer.class, customer.getId());
        } catch (Exception e) {
            System.out.println("Customer Not Found! , " + e.getMessage());
            return null;
        }
    }
}
