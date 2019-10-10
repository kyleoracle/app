/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.example.rest.dbcs;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class EmployeeDatabaseDAOImpl implements EmployeeDAO{
    
    List<Employee> eList = null;
	EmployeeDAO edao = new MockDAOImpl();


    @Override
    public List<Employee> getAllEmployees(){

		return edao.getAllEmployees();
		
    }
   
    @Override
    public boolean add(Employee employee){

		return edao.add(employee);

    }
    
    
    @Override
    public boolean update(long id, Employee employee){

		return edao.update(id, employee);
    
    }

    
}
