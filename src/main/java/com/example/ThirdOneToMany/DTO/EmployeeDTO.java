package com.example.ThirdOneToMany.DTO;

import com.example.ThirdOneToMany.DTO.CertificatesDTO;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class EmployeeDTO {
    private Long id;
    private String firstName;
    private String lastName;

    private List<CertificatesDTO> certificatesDTOS;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<CertificatesDTO> getCertificatesDTOS() {
        return certificatesDTOS;
    }

    public void setCertificatesDTOS(List<CertificatesDTO> certificatesDTOS) {
        this.certificatesDTOS = certificatesDTOS;
    }

    @Override
    public String toString() {
        return "EmployeeDTO{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", certificatesDTOS=" + certificatesDTOS +
                '}';
    }
}
