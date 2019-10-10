/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package com.example.rest.dbcs;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;

public class MockDAOImpl implements EmployeeDAO{
    
    private final CopyOnWriteArrayList<Employee> eList = MockEmployeeList.getInstance();
    
    @Override
    public List<Employee> getAllEmployees(){
        return eList;
    }
   

  
    
    @Override
    public boolean add(Employee employee){
        long next = eList.size() + 100;

        Employee nextEmployee = 
            new Employee( next, employee.getFirstName(), employee.getLastName(),
                employee.getEmail(), employee.getPhone(), 
                employee.getBirthDate(), employee.getTitle(), employee.getDepartment());
            
        eList.add(nextEmployee);
        return true;
    }
    
    
    @Override
    public boolean update(long id, Employee employee){
        int matchIndex = -1;
        
        matchIndex = eList.stream()
                    .filter(e -> e.getId() == id)
                    .findFirst()
                    .map(e -> eList.indexOf(e))
                    .orElse(matchIndex);
               
        if (matchIndex > -1){
            eList.set(matchIndex, employee);
            return true;           
        } else {
            return false;           
        }                
    
    }

    
   

}
