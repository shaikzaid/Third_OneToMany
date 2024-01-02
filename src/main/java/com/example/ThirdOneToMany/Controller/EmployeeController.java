package com.example.ThirdOneToMany.Controller;

import com.example.ThirdOneToMany.DTO.EmployeeDTO;
import com.example.ThirdOneToMany.Entity.Employee;
import com.example.ThirdOneToMany.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping
    public ResponseEntity<EmployeeDTO> saveEmployee(@RequestBody EmployeeDTO employeeDTO){
       EmployeeDTO employeeDTO1= employeeService.saveEmployee(employeeDTO);
        return new ResponseEntity<>(employeeDTO1,HttpStatus.CREATED);
    }
    @GetMapping("{id}")
    public ResponseEntity<Optional<Employee>> getEmployeeById(@PathVariable Long id){
        return new ResponseEntity<>(employeeService.getEmployeeById(id),HttpStatus.OK);
    }
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDTO> updateEmployee(@PathVariable Long id,@RequestBody EmployeeDTO employeeDTO){
        return new ResponseEntity<>(employeeService.updateEmployee(id, employeeDTO),HttpStatus.ACCEPTED);
    }
    @DeleteMapping("{id}")
    public void deleteEmployee(@PathVariable Long id){
        employeeService.deleteEmployeeId(id);
    }


}
