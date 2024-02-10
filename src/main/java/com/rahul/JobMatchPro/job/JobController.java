package com.rahul.JobMatchPro.job;


import com.rahul.JobMatchPro.job.Impl.JobServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.IllegalFormatCodePointException;
import java.util.List;


@RestController
public class JobController {





    private JobService jobService;

    public JobController(JobService jobService) {
        this.jobService = jobService;
    }

    // end point for returning all the jobs available
    @GetMapping("/jobs")
    public ResponseEntity<List<Job>> findAall(){

        return new ResponseEntity<>(jobService.findAll() , HttpStatus.CREATED);
    }


    //  for posting the jobs
    @PostMapping("/jobs")
    public ResponseEntity<String> createJob(@RequestBody Job job){

       jobService.createJob(job);

        return new ResponseEntity<>("added successfully !! " ,HttpStatus.CREATED);
    }

    @GetMapping("/jobs/{id}")
    public ResponseEntity<Job> getJobById(@PathVariable long id){

        Job job = jobService.getJobByJobId(id);
        if (job != null){
            return new ResponseEntity<>(job , HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


    @DeleteMapping("/jobs/{id}")
    public ResponseEntity<String> deleteJobById(@PathVariable long id){

      if (jobService.deleteById(id)){
          return new ResponseEntity<>("deleted " , HttpStatus.OK);
      }

      return new ResponseEntity<>("Id entered is not found" , HttpStatus.NOT_FOUND);


    }
}
