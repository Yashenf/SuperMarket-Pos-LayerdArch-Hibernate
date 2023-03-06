/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 04:34 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.dao.custom.impl;

import com.yashen.superMarket.dao.custom.OrderDAO;
import com.yashen.superMarket.entity.Order;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDAOImpl implements OrderDAO {
    @Override
    public Order save(Order order, Session session) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public Order update(Order order, Session session) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public Order delete(Order order, Session session) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<Order> getAll(Session session) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public Order getOrder(Order order, Session session) throws SQLException, ClassNotFoundException {
        return null;
    }
}
