package com.rahul.JobMatchPro.review;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ReviewService {

    List<Review> getAllReview(Long companyId);
    boolean addReview(Long companyId , Review review );

}
