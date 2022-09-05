package com.crescendo.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crescendo.model.Review;
import com.crescendo.model.Review;

import com.crescendo.service.ReviewServiceImpl;
@RestController
public class ReviewController {
	@Autowired
	private ReviewServiceImpl reviewService;

	@PostMapping("/addReview")
	public Review addReview(@RequestBody Review review) {
		return reviewService.createReview(review);
	}
	@GetMapping("/allReview")
	public List<Review> getAllReview() {
		return reviewService.getAllReview();
	}
	
	@DeleteMapping("/rbid/{id}")
	public String deleteReviewByBID(@PathVariable int id) {
		return reviewService.deleteReview(id);
	}
}
