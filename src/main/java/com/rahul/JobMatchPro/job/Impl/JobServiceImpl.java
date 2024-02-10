package com.rahul.JobMatchPro.job.Impl;

import com.rahul.JobMatchPro.job.Job;
import com.rahul.JobMatchPro.job.JobService;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class JobServiceImpl implements JobService {

    private List<Job> jobs = new ArrayList<>();

    private long nextId  = 1L ;

    @Override
    public List<Job> findAll() {
        return jobs;
    }

    @Override
    public void createJob(Job job) {
        job.setId(nextId++);
        jobs.add(job);
    }

    @Override
    public Job getJobByJobId(long id) {
        for (Job job:
             jobs) {
        if (Objects.equals(job.getId(), id)){
            return job;
        }
            
        }

        return null;
    }

    @Override
    public boolean deleteById(long id) {
        Iterator<Job> iterator = jobs.iterator();
        while (iterator.hasNext()) {
            Job job = iterator.next();
            if (job.getId() == id) {
                iterator.remove(); // Remove the job from the collection
                return true;

            }
        }
        return false;
    }


}
