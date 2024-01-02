package com.example.ThirdOneToMany.DTO;

import com.example.ThirdOneToMany.Entity.Employee;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CertificatesDTO {
  private Long id;
  private String name;

 // private Employee employee;

//    public Employee getEmployee() {
//        return employee;
//    }
//
//    public void setEmployee(Employee employee) {
//        this.employee = employee;
//    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "CertificatesDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
