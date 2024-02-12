package com.rahul.JobMatchPro.company.Impl;

import com.rahul.JobMatchPro.company.Company;
import com.rahul.JobMatchPro.company.CompanyRepository;
import com.rahul.JobMatchPro.company.CompanyService;

import java.util.List;

public class CompanyServiceImpl implements CompanyService {

    private CompanyRepository companyRepository;

    public CompanyServiceImpl(CompanyRepository companyRepository) {
        this.companyRepository = companyRepository;
    }

    @Override
    public List<Company> getAllCompanies() {
        return companyRepository.findAll();
    }
}
