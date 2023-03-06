/*
 * Created by @yash
 * 3/6/2023  , Monday
 * 01:40 PM
 * Project :SupermarketSystem
 * Contact me : contact.yashen@gmail.com
 */

import com.yashen.superMarket.dao.custom.CustomerDAO;
import com.yashen.superMarket.dao.custom.impl.CustomerDAOImpl;
import com.yashen.superMarket.entity.Customer;
import com.yashen.superMarket.entity.embedded.CustomerName;
import com.yashen.superMarket.util.db.FactoryConfiguration;
import org.hibernate.Session;

import java.sql.SQLException;
import java.util.ArrayList;

public class ConfigurationTest {
    public static void main(String[] args) throws SQLException, ClassNotFoundException {
        try (Session session = FactoryConfiguration.getInstance().getSession()) {
            //saveCustomer(session);
            getAllCustomers(session);
        }
    }

    private static void saveCustomer(Session session) throws SQLException, ClassNotFoundException {
        CustomerDAO customerDAO = new CustomerDAOImpl();
        CustomerName customerName = new CustomerName("Yashen", "Savindu" , "fernando");
        Customer customer = new Customer();
        customer.setName(customerName);
        customer.setCity("Matugama");
        customer.setEmail("Abc@gmail.com");
        customerDAO.save(customer,session);
    }

    private static void getAllCustomers(Session session) throws SQLException, ClassNotFoundException {
        CustomerDAO customerDAO = new CustomerDAOImpl();
        ArrayList<Customer> all = customerDAO.getAll(session);
        for (Customer c :
                all) {
            System.out.println(c.getId() + " , " + c.getEmail());
        }
    }
}
