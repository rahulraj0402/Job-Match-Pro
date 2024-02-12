package com.rahul.JobMatchPro.job.Impl;

import com.rahul.JobMatchPro.job.Job;
import com.rahul.JobMatchPro.job.JobRepository;
import com.rahul.JobMatchPro.job.JobService;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class JobServiceImpl implements JobService {

   // private List<Job> jobs = new ArrayList<>();

    JobRepository jobRepository;

    private long nextId  = 1L ;


    public JobServiceImpl(JobRepository jobRepository) {
        this.jobRepository = jobRepository;
    }

    @Override
    public List<Job> findAll() {
        return jobRepository.findAll();
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobRepository.save(job);
    }

    @Override
    public Job getJobByJobId(Long id) {
       return jobRepository.findById(id).orElse(null);
    }


    @Override
    public boolean deleteById(Long id) {
        Optional<Job> jobOptional = jobRepository.findById(id);
        if (jobOptional.isPresent()) {
            try {
                jobRepository.deleteById(id);
                return true;
            } catch (Exception e) {
                // Handle any potential exceptions
                return false;
            }
        } else {
            // Entity with the given ID doesn't exist, so deletion is unsuccessful
            return false;
        }
    }

    @Override
    public boolean updateJob(Long id, Job updatedJob) {

      Optional<Job> jobOptional = jobRepository.findById(id);
      if (jobOptional.isPresent()){
          Job job = jobOptional.get();
          job.setTitle(updatedJob.getTitle());
          job.setDescription(updatedJob.getDescription());
          job.setLocation(updatedJob.getLocation());
          job.setMaxSalary(updatedJob.getMaxSalary());
          job.setMinSalary(updatedJob.getMinSalary());
          jobRepository.save(job);
          return true;
      }

      return false;

    }



}













