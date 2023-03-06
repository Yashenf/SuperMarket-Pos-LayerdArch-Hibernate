/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 04:35 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.dao.custom.impl;

import com.yashen.superMarket.dao.custom.OrderDetailsDAO;
import com.yashen.superMarket.entity.Order;
import com.yashen.superMarket.entity.OrderDetails;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.sql.SQLException;
import java.util.ArrayList;

public class OrderDetailsDAOImpl implements OrderDetailsDAO {
    @Override
    public OrderDetails save(OrderDetails orderDetails, Session session) throws SQLException, ClassNotFoundException {
        try {
            int id = (int) session.save(orderDetails);
            orderDetails.setId(id);
            return orderDetails;
        } catch (Exception e) {
            System.out.println("Recode not Saved Succesfully! , " + e.getMessage());
            return null;
        }
    }

    @Override
    public OrderDetails update(OrderDetails orderDetails, Session session) throws SQLException, ClassNotFoundException {
        try {
            session.update(orderDetails);
            return orderDetails;
        } catch (Exception e) {
            System.out.println("Order-Detail is not Updated Succesfully! , " + e.getMessage());
            return null;
        }
    }

    @Override
    public OrderDetails delete(OrderDetails orderDetails, Session session) throws SQLException, ClassNotFoundException {
        try {
            OrderDetails tempOrderDetail = session.get(OrderDetails.class, orderDetails.getId());
            session.delete(orderDetails);
            return tempOrderDetail;
        } catch (Exception e) {
            System.out.println("Order-Detail is not Deleted Succesfully! , " + e.getMessage());
            return null;
        }
    }

    @Override
    public ArrayList<OrderDetails> getAll(Session session) throws SQLException, ClassNotFoundException {
        try {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<OrderDetails> criteria = builder.createQuery(OrderDetails.class);
            criteria.from(OrderDetails.class);
            ArrayList<OrderDetails> data = (ArrayList<OrderDetails>) session.createQuery(criteria).getResultList();
            return data;
        } catch (Exception e) {
            System.out.println("Order-Details Not Lorded! , " + e.getMessage());
            return null;
        }
    }

    @Override
    public OrderDetails getBill(OrderDetails orderDetails, Session session) throws SQLException, ClassNotFoundException {
        try {
            OrderDetails tempOrderDetail = session.get(OrderDetails.class, orderDetails.getId());
            return orderDetails;
        } catch (Exception e) {
            System.out.println("Order-Detail Not Lorded! , " + e.getMessage());
            return null;
        }
    }
}
