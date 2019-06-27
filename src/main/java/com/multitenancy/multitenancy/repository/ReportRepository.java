package com.multitenancy.multitenancy.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.multitenancy.multitenancy.model.Report;


public interface ReportRepository extends JpaRepository<Report, Long>{

}
