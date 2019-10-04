package latihan.endpoint.controller;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.sql.SQLException;
import java.sql.ResultSet;

import io.micronaut.http.MediaType;

import com.google.gson.Gson;

import latihan.endpoint.Database;
import latihan.endpoint.model.Employee;
import latihan.endpoint.repository.EmployeeRepository;

@Controller("/")
public class Index {
    
    @Get(produces=MediaType.APPLICATION_JSON)
    public String index() throws SQLException {
        return (new Gson().toJson(EmployeeRepository.getAll()));
    }
}