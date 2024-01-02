package com.example.ThirdOneToMany.Controller;

import com.example.ThirdOneToMany.DTO.CertificatesDTO;
import com.example.ThirdOneToMany.Service.CertificateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/controller")
public class CertificateController {
    @Autowired
    CertificateService certificateService;

    @PostMapping("{id}")
    public ResponseEntity<CertificatesDTO> saveCertificate(@PathVariable Long id, @RequestBody CertificatesDTO certificatesDTO){
        return new ResponseEntity<>(certificateService.saveCertificate(id,certificatesDTO), HttpStatus.CREATED);
    }

    @DeleteMapping("{id}")
    public void deleteCertificates(@PathVariable Long id){
        certificateService.DeleteCertificateById(id);
    }

}
