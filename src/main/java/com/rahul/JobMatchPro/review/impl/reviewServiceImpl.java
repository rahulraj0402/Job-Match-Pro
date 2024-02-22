package com.rahul.JobMatchPro.review.impl;


import com.rahul.JobMatchPro.review.Review;
import com.rahul.JobMatchPro.review.ReviewRepository;
import com.rahul.JobMatchPro.review.ReviewService;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Service
public class reviewServiceImpl implements ReviewService {

    @Autowired
    ReviewRepository reviewRepository;

    @Override
    public List<Review> getAllReview(Long companyId) {
        return reviewRepository.findByCompanyId(companyId);
    }
}
