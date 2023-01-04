package org.example.app;

import org.example.app.services.EmployeeService;

import java.io.File;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.file.Paths;

public class App {

    public static void main(String[] args) throws URISyntaxException {

        URL res =  App.class.getClassLoader().getResource("files/staff.json");
        File file = Paths.get(res.toURI()).toFile();
        String path = file.getAbsolutePath();

        EmployeeService reader = new EmployeeService();
        reader.readData(path);
    }
}
