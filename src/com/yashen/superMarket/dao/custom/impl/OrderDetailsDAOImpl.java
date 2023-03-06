/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 04:35 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.dao.custom.impl;

import com.yashen.superMarket.dao.custom.OrderDetailsDAO;
import com.yashen.superMarket.entity.OrderDetails;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailsDAOImpl implements OrderDetailsDAO {
    @Override
    public OrderDetails save(OrderDetails orderDetails, Session session) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public OrderDetails update(OrderDetails orderDetails, Session session) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public OrderDetails delete(OrderDetails orderDetails, Session session) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public ArrayList<OrderDetails> getAll(Session session) throws SQLException, ClassNotFoundException {
        return null;
    }

    @Override
    public OrderDetails getBill(OrderDetails orderDetails, Session session) throws SQLException, ClassNotFoundException {
        return null;
    }
}
