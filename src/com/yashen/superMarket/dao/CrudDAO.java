/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 04:13 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket.dao;

import com.yashen.superMarket.entity.SuperEntity;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CrudDAO<T extends SuperEntity,ID> {
     T save(T t , Session session) throws SQLException,ClassNotFoundException;
     T update(T t , Session session) throws SQLException,ClassNotFoundException;
     T delete(T t , Session session) throws SQLException,ClassNotFoundException;
     ArrayList<T> getAll(Session session) throws SQLException,ClassNotFoundException;
}
