/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 04:29 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.dao.custom;

import com.yashen.superMarket.dao.CrudDAO;
import com.yashen.superMarket.entity.Customer;
import com.yashen.superMarket.entity.Order;
import org.hibernate.Session;

import java.sql.SQLException;

public interface OrderDAO extends CrudDAO<Order,Long> {
    Order getOrder(Order order , Session session) throws SQLException,ClassNotFoundException;
}
