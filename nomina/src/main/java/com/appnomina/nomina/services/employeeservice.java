package com.appnomina.nomina.services;

import java.util.ArrayList;

import com.appnomina.nomina.models.employeemodel;
import com.appnomina.nomina.repository.employeerepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class employeeservice {
    @Autowired
    employeerepository employeeRepository;

    public employeemodel AddEmployee( employeemodel employee) {
        employeeRepository.save(employee);
        return employee;
    }

    public ArrayList<employeemodel> GetAllEmployees() {
        return (ArrayList<employeemodel>) employeeRepository.findAll();
    }

    public employeemodel GetEmployee(String id) {
        return employeeRepository.findById(id).get();
    }

    public employeemodel UpdateEmployee(String id, employeemodel employee) {
        employeemodel employeeToUpdate = employeeRepository.findById(id).get();
        employeeToUpdate.setName(employee.getName());
        employeeToUpdate.setLastname(employee.getLastname());
        employeeToUpdate.setEmail(employee.getEmail());
        employeeToUpdate.setPhone(employee.getPhone());
        employeeToUpdate.setAddress(employee.getAddress());
        employeeToUpdate.setCity(employee.getCity());
        employeeToUpdate.setCountry(employee.getCountry());
        employeeToUpdate.setHeadquarter(employee.getHeadquarter());
        employeeRepository.save(employeeToUpdate);
        return employeeToUpdate;
    }

    public employeemodel DeleteEmployee(String id) {
        employeemodel employee = employeeRepository.findById(id).get();
        employeeRepository.delete(employee);
        return employee;
    }
}
