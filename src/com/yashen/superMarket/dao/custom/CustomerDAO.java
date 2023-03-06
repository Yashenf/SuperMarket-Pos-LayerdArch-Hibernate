/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 04:22 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.dao.custom;

import com.yashen.superMarket.dao.CrudDAO;
import com.yashen.superMarket.entity.Customer;
import org.hibernate.Session;

import java.sql.SQLException;

public interface CustomerDAO extends CrudDAO<Customer, Long> {
    Customer getCustomer(Customer customer , Session session) throws SQLException,ClassNotFoundException;
}
