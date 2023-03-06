/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 04:27 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.dao.custom;

import com.yashen.superMarket.dao.CrudDAO;
import com.yashen.superMarket.entity.Product;
import org.hibernate.Session;

import java.sql.SQLException;

public interface ProductDAO extends CrudDAO<Product,Long> {
    Product getProduct(Product product , Session session) throws SQLException,ClassNotFoundException;
}
