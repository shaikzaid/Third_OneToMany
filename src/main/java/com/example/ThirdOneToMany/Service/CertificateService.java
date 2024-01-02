package com.example.ThirdOneToMany.Service;

import com.example.ThirdOneToMany.DAO.CertificatesRepository;
import com.example.ThirdOneToMany.DAO.EmployeeRepository;
import com.example.ThirdOneToMany.DTO.CertificatesDTO;
import com.example.ThirdOneToMany.DTO.EmployeeDTO;
import com.example.ThirdOneToMany.DTOConverter.EntityDTOConverter;
import com.example.ThirdOneToMany.Entity.Certificates;
import com.example.ThirdOneToMany.Entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CertificateService {

    @Autowired
    CertificatesRepository certificatesRepository;
    @Autowired
    EmployeeRepository employeeRepository;
    @Autowired
    EntityDTOConverter entityDTOConverter;

    public CertificatesDTO saveCertificate(Long id, CertificatesDTO certificatesDTO){
        Optional<Employee> employee= employeeRepository.findById(id);
        if(employee.isPresent()){
            Employee employee1=employee.get();
           Certificates certificates= entityDTOConverter.convertToCertificates(certificatesDTO);
           employee1.getCertificates().add(certificates);
            employeeRepository.save(employee1);

           return certificatesDTO;//check weather this return certificate with id
        }
        else {
            return null;
        }
    }
    public void DeleteCertificateById(Long id ){
          certificatesRepository.deleteById(id);
    }

}
