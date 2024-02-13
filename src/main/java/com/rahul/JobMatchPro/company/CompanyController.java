package com.rahul.JobMatchPro.company;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("companies")
public class CompanyController {
    private CompanyService companyService;

    public CompanyController(CompanyService companyService) {
        this.companyService = companyService;
    }

    @GetMapping
    public List<Company> getAllCompanies(){
        return companyService.getAllCompanies();
    }

    @PutMapping
    public ResponseEntity<String> updateCompany(@PathVariable Long id , @RequestBody Company company){

        return new ResponseEntity<>("The id you have entered is not fount" , HttpStatus.NOT_FOUND);
    }


}
