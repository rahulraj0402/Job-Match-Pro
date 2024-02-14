package com.rahul.JobMatchPro.company;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.rahul.JobMatchPro.job.Job;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;
@Getter
@Setter
@NoArgsConstructor
@Entity
public class Company {

   @Id()
   @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name ;
    private String description ;

    @JsonIgnore
    @OneToMany(mappedBy = "company")
    private List<Job> jobs ;

//    private List<Reviews> reviews ;


}
