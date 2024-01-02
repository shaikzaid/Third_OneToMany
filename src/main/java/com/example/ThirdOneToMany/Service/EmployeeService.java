package com.example.ThirdOneToMany.Service;

import com.example.ThirdOneToMany.DAO.EmployeeRepository;
import com.example.ThirdOneToMany.DTO.CertificatesDTO;
import com.example.ThirdOneToMany.DTO.EmployeeDTO;
import com.example.ThirdOneToMany.DTOConverter.EntityDTOConverter;
import com.example.ThirdOneToMany.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EntityDTOConverter entityDTOConverter;
    @Autowired
    CertificatesDTO certificatesDTO;

    public EmployeeDTO saveEmployee(EmployeeDTO employeeDTO){
        Employee employee = entityDTOConverter.convertToEmployee(employeeDTO);
        Employee savedEmployee = employeeRepository.save(employee);
       // certificatesDTO.setEmployee(employee);
        return entityDTOConverter.convertToEmployeeDTO(savedEmployee);
    }

    public Optional<Employee> getEmployeeById(Long id){
        return employeeRepository.findById(id);
//        Optional<Employee> savedEmployee=employeeRepository.findById(id);
//       if(savedEmployee.isPresent()){
//           Employee employee=savedEmployee.get();
//           return entityDTOConverter.convertToEmployeeDTO(employee);
//       }
//       else {
//           return null;
//       }
    }

    public void deleteEmployeeId(Long id){
        employeeRepository.deleteById(id);
    }

    public List<Employee> getAllEmployee(){
        List<Employee> employees= employeeRepository.findAll();
        return employees;
    }

    public EmployeeDTO updateEmployee(Long id,EmployeeDTO employeeDTO){
        Optional<Employee> employee= employeeRepository.findById(id);
        if(employee.isPresent()){
       Employee employee1=employee.get();
       employee1.setFirstName(employeeDTO.getFirstName());
       employee1.setLastName(employeeDTO.getLastName());
       return entityDTOConverter.convertToEmployeeDTO(employee1);
        }
        else {
            return null;
        }
    }
}
