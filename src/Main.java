import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        CustomerController customerController = new CustomerController();


        CustomerRepository customerRepository = new CustomerRepository();

        customerRepository.getAllCustomers();
    }
}