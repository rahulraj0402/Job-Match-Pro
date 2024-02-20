package com.rahul.JobMatchPro.company;

import java.util.List;
import java.util.Optional;

public interface CompanyService {
    List<Company> getAllCompanies ();
    boolean updateCompany(Company company , Long id);
    void createCompany(Company company);

    Company getCompanyById(Long id);
    boolean deleteCompanyById(Long id);

    List<Company> findByName(String name);

}
