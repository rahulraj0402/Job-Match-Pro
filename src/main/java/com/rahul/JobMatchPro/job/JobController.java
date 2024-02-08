package com.rahul.JobMatchPro.job;


import com.rahul.JobMatchPro.job.Impl.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;


@RestController
public class JobController {





    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    // end point for returning all the jobs available
    @GetMapping("/jobs")
    public List<Job> findAall(){

        return jobService.findAll();
    }


    //  for posting the jobs
    @PostMapping("/jobs")
    public String createJob(@RequestBody Job job){

       jobService.createJob(job);

        return "Job is added !  ";
    }

    @GetMapping("/jobs/{id}")
    public Job getJobById(@PathVariable long id){
        Job job = jobService.getJobByJobId(id);
        if (job != null){
            return job;
        }
        return new Job(1L , "Test" , "Test" , "Test" ,"Test" , "Test");
    }
}
