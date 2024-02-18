package org.example.thuchanhjdbc1.model.service;

import com.mysql.jdbc.Driver;
import org.example.thuchanhjdbc1.model.Customer;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerServiceJDBC implements ICustomerService{
    public Connection getConnection(){
        Connection connection = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/c1023h1jdbc",
                    "root",
                    "12345678");
            System.out.println("Ket noi thanh cong");
        } catch (ClassNotFoundException e) {
            System.out.println("Ket noi khong thanh cong");
            throw new RuntimeException(e);
        } catch (SQLException e) {
            System.out.println("Ket noi khong thanh cong");
            throw new RuntimeException(e);
        }
        return connection;
    }
    @Override
    public List<Customer> findAll() {
        List<Customer> c = new ArrayList<>();
//        return null;
        Connection connection = getConnection();
        try {
            PreparedStatement getAllQuery = connection.prepareStatement("select  * from customers;");
            ResultSet resultSet = getAllQuery.executeQuery();
            while (resultSet.next()){
                String name =resultSet.getString("name");
                String dob  =resultSet.getString("dob");
                String address = resultSet.getString("address");
                Customer customer = new Customer(name,dob,address);
                c.add(customer);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return c;
    }

    @Override
    public void save(Customer c) {

    }
}
