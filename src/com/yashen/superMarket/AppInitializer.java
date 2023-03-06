/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 02:33 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

package com.yashen.superMarket;

import com.yashen.superMarket.util.db.FactoryConfiguration;
import org.hibernate.Session;

public class AppInitializer {
    public static void main(String[] args) {
        Session session = FactoryConfiguration.getInstance().getSession();
    }
}
