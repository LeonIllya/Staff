package org.example.app.services;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import org.example.app.entity.Employee;


import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class EmployeeService {

    public void readData(String path) {

        try {

            Gson gson = new Gson();

            Reader reader = Files.newBufferedReader(Paths.get(path));

            List<Employee> contacts = gson.fromJson(reader,
                    new TypeToken<List<Employee>>() {}.getType());

            AtomicInteger cnt = new AtomicInteger(0);

            contacts.forEach(contact -> System.out.println(cnt.incrementAndGet() + ") " +
                    contact.getName() + " " +
                    contact.getPosition() + " " +
                    contact.getPhone() + " " +
                    contact.getSalary())
            );

            reader.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
