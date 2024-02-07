package com.rahul.JobMatchPro.job;


import lombok.*;



@AllArgsConstructor
@Setter
@Getter
public class Job {
    private long id;
    private String title;
    private String description;
    private String minSalary;
    private String maxSalary;
    private String location;
}