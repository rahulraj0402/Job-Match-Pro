package com.rahul.JobMatchPro.company.Impl;

import com.rahul.JobMatchPro.company.Company;
import com.rahul.JobMatchPro.company.CompanyRepository;
import com.rahul.JobMatchPro.company.CompanyService;
import com.rahul.JobMatchPro.job.Job;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    @Override
    public boolean updateCompany(Company updatedCompany , Long id) {
        Optional<Company> companyOptional = companyRepository.findById(id);
        if (companyOptional.isPresent()){
            Company company = companyOptional.get();
            company.setDescription(updatedCompany.getDescription());
            company.setName(updatedCompany.getName());
            company.setJobs(updatedCompany.getJobs());
            companyRepository.save(company);
            return true;
        }

        return false;
    }

    @Override
    public void createCompany(Company company) {
      companyRepository.save(company);
    }
}
