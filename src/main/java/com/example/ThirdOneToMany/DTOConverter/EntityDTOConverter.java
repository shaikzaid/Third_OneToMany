package com.example.ThirdOneToMany.DTOConverter;

import com.example.ThirdOneToMany.DTO.CertificatesDTO;
import com.example.ThirdOneToMany.DTO.EmployeeDTO;
import com.example.ThirdOneToMany.Entity.Certificates;
import com.example.ThirdOneToMany.Entity.Employee;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import java.util.stream.Collectors;

@Component
public class EntityDTOConverter {
    private static final ModelMapper modelmapper=new ModelMapper();

    public EmployeeDTO convertToEmployeeDTO(Employee employee){
        return modelmapper.map(employee,EmployeeDTO.class);
    }

    public CertificatesDTO convertToCertificateDTO(Certificates certificates){
        return modelmapper.map(certificates,CertificatesDTO.class);
    }

    public Employee convertToEmployee(EmployeeDTO employeeDTO){
        return modelmapper.map(employeeDTO,Employee.class);
    }

    public Certificates convertToCertificates(CertificatesDTO certificatesDTO){
        return modelmapper.map(certificatesDTO,Certificates.class);
    }

}
