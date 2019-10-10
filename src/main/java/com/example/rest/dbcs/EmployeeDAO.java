/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.example.rest.dbcs;

import java.util.List;

public interface EmployeeDAO {
    public List<Employee> getAllEmployees();
    
    public boolean add(Employee employee);  // False equals fail
    public boolean update(long id, Employee employee); // False equals fail
}
