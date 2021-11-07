package com.appnomina.nomina.repository;

import com.appnomina.nomina.models.employeemodel;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface employeerepository extends MongoRepository<employeemodel, String> {

}
