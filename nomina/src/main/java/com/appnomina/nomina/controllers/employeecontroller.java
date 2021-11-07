package com.appnomina.nomina.controllers;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;

import com.appnomina.nomina.models.employeemodel;
import com.appnomina.nomina.services.employeeservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "*",methods = {RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RequestMapping("/employee")
public class employeecontroller {
    @Autowired
    employeeservice employeeservice;
    @PostMapping(path = "/AddEmployee")
    public void AddEmployee(@RequestBody employeemodel employeemodel) {
        employeeservice.AddEmployee(employeemodel);
    }
    @GetMapping(path = "/GetAllEmployees")
    public ArrayList<employeemodel> GetAllEmployees() {
        return employeeservice.GetAllEmployees();
    }
    @GetMapping(path = "/GetEmployee/{id}")
    public employeemodel GetEmployeeById(@PathVariable("id") String id){
        return this.employeeservice.GetEmployee(id);
    }
    @PutMapping(path = "/UpdateEmployee/{id}")
    public void UpdateEmployee(@PathVariable("id") String id,@RequestBody employeemodel employeemodel) {
        employeeservice.UpdateEmployee(id,employeemodel);
    }
    @DeleteMapping(path = "/DeleteEmployee/{id}")
    public void DeleteEmployee(@PathVariable("id") String id){
        this.employeeservice.DeleteEmployee(id);
    }
}
