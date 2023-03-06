/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 04:34 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.dao.custom.impl;

import com.yashen.superMarket.dao.custom.OrderDAO;
import com.yashen.superMarket.entity.Customer;
import com.yashen.superMarket.entity.Order;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDAOImpl implements OrderDAO {
    @Override
    public Order save(Order order, Session session) throws SQLException, ClassNotFoundException {
        try {
            long id = (long) session.save(order);
            order.setId(id);
            return order;
        } catch (Exception e) {
            System.out.println("Order is not Saved Succesfully! , " + e.getMessage());
            return null;
        }
    }

    @Override
    public Order update(Order order, Session session) throws SQLException, ClassNotFoundException {
        try {
            session.update(order);
            return order;
        } catch (Exception e) {
            System.out.println("Order is not Updated Succesfully! , " + e.getMessage());
            return null;
        }
    }

    @Override
    public Order delete(Order order, Session session) throws SQLException, ClassNotFoundException {
        try {
            Order tempOrder = session.get(Order.class, order.getId());
            session.delete(order);
            return tempOrder;
        } catch (Exception e) {
            System.out.println("Order is not Deleted Succesfully! , " + e.getMessage());
            return null;
        }
    }

    @Override
    public ArrayList<Order> getAll(Session session) throws SQLException, ClassNotFoundException {
        try {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Order> criteria = builder.createQuery(Order.class);
            criteria.from(Order.class);
            ArrayList<Order> data = (ArrayList<Order>) session.createQuery(criteria).getResultList();
            return data;
        } catch (Exception e) {
            System.out.println("Order Not Lorded! , " + e.getMessage());
            return null;
        }
    }

    @Override
    public Order getOrder(Order order, Session session) throws SQLException, ClassNotFoundException {
        try {
            Order tempOrder = session.get(Order.class, order.getId());
            return order;
        } catch (Exception e) {
            System.out.println("Order Not Lorded! , " + e.getMessage());
            return null;
        }
    }
}
