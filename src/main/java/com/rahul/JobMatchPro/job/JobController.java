package com.rahul.JobMatchPro.job;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;


@RestController
public class JobController {

    private List<Job> jobs = new ArrayList<>();



    // end point for returning all the jobs available
    @GetMapping("/jobs")
    public List<Job> findAall(){

        return jobs;
    }


    //  for posting the jobs
    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){

        jobs.add(job);

        return "Job is added successfully";
    }
}
