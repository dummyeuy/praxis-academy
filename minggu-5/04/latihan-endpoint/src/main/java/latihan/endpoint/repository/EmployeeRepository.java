package latihan.endpoint.repository;

import java.sql.SQLException;
import java.util.ArrayList;
import java.sql.ResultSet;


import latihan.endpoint.Database;
import latihan.endpoint.model.Employee;

public class EmployeeRepository {
    public static ArrayList<Employee> getAll() {
        ArrayList<Employee> data = new ArrayList();
        try {
            ResultSet res = Database
            .getConnection()
            .createStatement()
            .executeQuery("SELECT * FROM customers");

        while(res.next()) {
            data.add(new Employee(res.getInt("ID"), res.getString("NAME"), res.getInt("AGE"), res.getString("ADDRESS"), res.getDouble("SALARY")));
        }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return data;
    }
}