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
    public ResponseEntity<List<Company>> getAllCompanies(){
         List<Company> list =companyService.getAllCompanies();
         return new ResponseEntity<>(list , HttpStatus.OK);

    }

    @PutMapping("/{id}")
    public ResponseEntity<String> updateCompany(@PathVariable Long id , @RequestBody Company company){

        boolean updated = companyService.updateCompany(company , id);
        if (updated){
            return new ResponseEntity<>("Updated" , HttpStatus.OK);
        }
        return new ResponseEntity<>("The id you have entered is not fount" , HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<String> createCompany(@RequestBody Company company){

        companyService.createCompany(company);
        return new ResponseEntity<>("Company added" , HttpStatus.CREATED);
    }




}
