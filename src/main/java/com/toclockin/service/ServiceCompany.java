package com.toclockin.service;

import com.toclockin.model.Company;
import com.toclockin.repository.RepositoryCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ServiceCompany {
    @Autowired
    RepositoryCompany repositoryCompany;

    public Company saveCompany(Company company){
        return repositoryCompany.save(company);
    }

    public List<Company> findAll() {
        return repositoryCompany.findAll();
    }

    public Optional<Company> getById(Long idCompany) {
        return Optional.of(repositoryCompany.getById(idCompany));
    }

    public Company updateCompany(Company company){
        return repositoryCompany.save(company);
    }

    public void deleteCompany(Long idCompany) {
        repositoryCompany.deleteById(idCompany);
    }
}
