/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 01:40 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

import com.yashen.superMarket.util.db.FactoryConfiguration;
import org.hibernate.Session;

public class ConfigurationTest {
    public static void main(String[] args) {
        try (Session session = FactoryConfiguration.getInstance().getSession()) {
            System.out.println("Created New Session Succesfully!");
        }
    }
}
