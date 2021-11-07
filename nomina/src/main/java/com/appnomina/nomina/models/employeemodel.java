package com.appnomina.nomina.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("employees")
public class employeemodel {
    @Id
    private String id;
    private String name;
    private String lastname;
    private String docid;
    private String phone; 
    private String email;
    private String address;
    private String city;
    private String country;
    private String headquarter;
    private String position;
    private String salary;
    private String date;

    public employeemodel() {
    }

    public employeemodel(String id,String name,String lastname,String docid,
                         String phone,String email,String address,String city,
                         String country,String headquarter,String position,
                         String salary,String date){
        this.id = id;
        this.name = name;
        this.lastname = lastname;
        this.docid = docid;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.city = city;
        this.country = country;
        this.headquarter = headquarter;
        this.position = position;
        this.salary = salary;
        this.date = date;   
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getLastname() {
        return lastname;
    }
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
    public String getDocid() {
        return docid;
    }
    public void setDocid(String docid) {
        this.docid = docid;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public String getCountry() {
        return country;
    }
    public void setCountry(String country) {
        this.country = country;
    }
    public String getHeadquarter() {
        return headquarter;
    }
    public void setHeadquarter(String headquarter) {
        this.headquarter = headquarter;
    }
    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
    public String getSalary() {
        return salary;
    }
    public void setSalary(String salary) {
        this.salary = salary;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
}
