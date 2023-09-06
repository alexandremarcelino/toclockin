package com.toclockin.repository;

import com.toclockin.model.Company;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositoryCompany extends JpaRepository<Company, Long> {
}
