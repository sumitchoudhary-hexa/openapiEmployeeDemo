package com.sumit.pack.controller;

import com.sumit.pack.api.EmployeeApi;
import com.sumit.pack.mapper.EmployeeMapper;
import com.sumit.pack.models.Employee;
import com.sumit.pack.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.request.NativeWebRequest;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
public class EmployeeController implements EmployeeApi {

    @Autowired
    EmployeeRepository employeeRepository;



    @Override
    public ResponseEntity<List<Employee>> employeeGet() {

        List<com.sumit.pack.entities.Employee> employees = employeeRepository.findAll();
        List<Employee> employeesModel = new ArrayList<>();
        for ( com.sumit.pack.entities.Employee employee: employees) {
            employeesModel.add(EmployeeMapper.INSTANCE.empEntityToEmpModel(employee));
        }
        return new ResponseEntity<>(employeesModel, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Employee>> employeePost(List<Employee> employee) {
        System.out.println(employee.toString());
//        employeeRepository.saveAll(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Employee>> employeePut(List<Employee> employee) {
//        employeeRepository.saveAll(employee);
        return new ResponseEntity<>(employee, HttpStatus.OK);
    }

    @Override
    public ResponseEntity<List<Employee>> employeeIdDelete(Employee id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Employee>> employeeIdGet(Integer id) {
        return null;
    }

    @Override
    public ResponseEntity<List<Employee>> employeeNameGet(String name) {
//        return new ResponseEntity<>(employeeRepository.findByName(name),HttpStatus.OK);
        return null;
    }
}
