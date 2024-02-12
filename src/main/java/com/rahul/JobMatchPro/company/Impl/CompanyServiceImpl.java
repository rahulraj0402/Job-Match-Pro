package com.rahul.JobMatchPro.company.Impl;

import com.rahul.JobMatchPro.company.Company;
import com.rahul.JobMatchPro.company.CompanyRepository;
import com.rahul.JobMatchPro.company.CompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CompanyServiceImpl implements CompanyService {

    @Autowired
    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }


    public CompanyServiceImpl() {
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}
