/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 04:34 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.dao.custom.impl;

import com.yashen.superMarket.dao.custom.ProductDAO;
import com.yashen.superMarket.entity.Product;
import org.hibernate.Session;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import java.sql.SQLException;
import java.util.ArrayList;

public class ProductDaoImpl implements ProductDAO {
    @Override
    public Product save(Product product, Session session) throws SQLException, ClassNotFoundException {
        try {
            long code = (long) session.save(product);
            product.setCode(code);
            return product;
        } catch (Exception e) {
            System.out.println("Product Not Saved!  , " + e.getMessage());
            return null;
        }
    }

    @Override
    public Product update(Product product, Session session) throws SQLException, ClassNotFoundException {
        try {
            session.update(product);
            return product;
        } catch (Exception e) {
            System.out.println("Product Not Updated!  , " + e.getMessage());
            return null;
        }
    }

    @Override
    public Product delete(Product product, Session session) throws SQLException, ClassNotFoundException {
        try {
            Product tempProduct = session.get(Product.class, product.getCode());
            session.delete(product);
            return tempProduct;
        } catch (Exception e) {
            System.out.println("Product Not Deleted!  , " + e.getMessage());
            return null;
        }
    }

    @Override
    public ArrayList<Product> getAll(Session session) throws SQLException, ClassNotFoundException {
        try {
            CriteriaBuilder builder = session.getCriteriaBuilder();
            CriteriaQuery<Product> criteria = builder.createQuery(Product.class);
            criteria.from(Product.class);
            return (ArrayList<Product>) session.createQuery(criteria).getResultList();
        } catch (Exception e) {
            System.out.println("Product Not Deleted!  , " + e.getMessage());
            return null;
        }
    }

    @Override
    public Product getProduct(Product product, Session session) throws SQLException, ClassNotFoundException {
        try {
            return session.get(Product.class, product.getCode());
        } catch (Exception e) {
            System.out.println("Product Not Deleted!  , " + e.getMessage());
            return null;
        }
    }
}
