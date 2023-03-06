/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 06:40 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.dao;

import com.yashen.superMarket.dao.custom.impl.CustomerDAOImpl;
import com.yashen.superMarket.dao.custom.impl.OrderDAOImpl;
import com.yashen.superMarket.dao.custom.impl.OrderDetailsDAOImpl;
import com.yashen.superMarket.dao.custom.impl.ProductDaoImpl;

public class DAOFactory {
    private static DAOFactory daoFactory;

    private DAOFactory() {
    }

    public DAOFactory getInstance(){
        return daoFactory == null ? (daoFactory = new DAOFactory()):daoFactory;
    }

    public SuperDAO getDAO(DAOTypes daoType){
        switch (daoType){
            case CUSTOMER:
                return new CustomerDAOImpl();
            case PRODUCT:
                return new ProductDaoImpl();
            case ORDER:
                return new OrderDAOImpl();
            case ORDER_DETAILS:
                return new OrderDetailsDAOImpl();
            default:
                return null;
        }
    }
}
