package com.example.ThirdOneToMany.DAO;

import com.example.ThirdOneToMany.Entity.Certificates;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CertificatesRepository extends JpaRepository<Certificates,Long> {
}
