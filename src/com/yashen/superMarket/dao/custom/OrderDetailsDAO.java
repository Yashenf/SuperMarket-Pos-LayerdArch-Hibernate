/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 04:30 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.dao.custom;

import com.yashen.superMarket.dao.CrudDAO;
import com.yashen.superMarket.entity.Customer;
import com.yashen.superMarket.entity.OrderDetails;
import org.hibernate.Session;

import java.sql.SQLException;

public interface OrderDetailsDAO extends CrudDAO<OrderDetails, Integer> {
    OrderDetails getBill(OrderDetails orderDetails , Session session) throws SQLException,ClassNotFoundException;
}
