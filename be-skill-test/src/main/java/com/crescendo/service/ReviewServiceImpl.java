package com.crescendo.service;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crescendo.model.Review;
import com.crescendo.repository.ReviewRepository;



@Service
public class ReviewServiceImpl {
	@Autowired
	private ReviewRepository reviewRepository;

	public Review createReview(Review review) {
		return reviewRepository.save(review);
		
	}
	public List<Review> getAllReview() {
		return reviewRepository.findAll();
		
	}

	
	  public String deleteReview(int id) {
	  reviewRepository.deleteReviewByBusinessId(id); 
	  return ("delete Reveiew by Id");
	  
	  
	  }
	 
}
