package com.rahul.JobMatchPro.review;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@RestController
@RequestMapping("/companies/{companyId}")
public class reviewController {

    @Autowired
    private ReviewService reviewService;

    @GetMapping("/reviews")
    public ResponseEntity<List<Review>> getAllReviews(@PathVariable Long companyId){
        return new ResponseEntity<>(reviewService.getAllReview(companyId) , HttpStatus.OK);
    }

    @PostMapping("/reviews")
    public ResponseEntity<String> addReview(@PathVariable Long companyId ,
                                            @RequestBody Review review){

        boolean isReviewSaved = reviewService.addReview(companyId , review);
        if (isReviewSaved){
            return new ResponseEntity<>("Review is added" , HttpStatus.CREATED);
        }
        else {
           return new ResponseEntity<>("Review is not saved" , HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/reviews/{reviewId}")
    public ResponseEntity<Review> getReviewById(@PathVariable Long companyId ,
                                                @PathVariable Long reviewId ){
        return new ResponseEntity<>(reviewService.getReview(companyId , reviewId) , HttpStatus.OK);
    }

    @PutMapping("/reviews/{reviewId}")
    public ResponseEntity<String> updateReview(@PathVariable Long companyId ,
                                               @PathVariable Long reviewId ,
                                               @RequestBody Review review){
       boolean isUpdated = reviewService.updateReview(companyId , reviewId , review);

       if (isUpdated){
           return new ResponseEntity<>("Updated successfully !! " , HttpStatus.OK);
       }
       return new ResponseEntity<>("Not Updated " , HttpStatus.NOT_FOUND);
    }


    @DeleteMapping("/reviews/{reviewId}")
    public ResponseEntity<String> deleteReview(@PathVariable Long companyId ,
                                                 @PathVariable Long reviewId){

        boolean isDeleted = reviewService.deleteReview(companyId , reviewId);
        if (isDeleted){
            return new ResponseEntity<>("deleted  successfully !! " , HttpStatus.OK);
        }
        return new ResponseEntity<>("Not deleted !!  " , HttpStatus.NOT_FOUND);

    }


}
