package com.toclockin.controller;

import com.toclockin.model.Company;
import com.toclockin.service.ServiceCompany;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.NoSuchElementException;

public class CompanyController {
    @Autowired
    private ServiceCompany serviceCompany;

    @PostMapping
    public Company create(@RequestBody Company company){
        return serviceCompany.saveCompany(company);
    }

    @GetMapping
    public List<Company> getCompanyList(){
        return serviceCompany.findAll();
    }

    @GetMapping("/{idCompany}")
    public ResponseEntity<Company> getCompanyByID(@PathVariable("idCompany") Long idCompany) throws Exception {
        return ResponseEntity.ok(serviceCompany.getById(idCompany).orElseThrow(() -> new NoSuchElementException("Not found!")));
    }

    @PutMapping
    public Company updateCompany(@RequestBody Company company){
        return serviceCompany.updateCompany(company);
    }

    @DeleteMapping("/{idCompany}")
    public ResponseEntity deleteByID(@PathVariable("idCompany") Long idCompany) throws Exception{
        try {
            serviceCompany.deleteCompany(idCompany);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ResponseEntity.ok("Empresa deletada com sucesso!");
    }
}
