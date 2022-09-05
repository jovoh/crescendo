package com.crescendo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import com.crescendo.model.Review;

public interface ReviewRepository extends JpaRepository<Review, Integer> {

	 @Modifying
	 @Transactional
	 @Query("delete from Review r where r.bid = ?1")
	    void deleteReviewByBusinessId(int bid);


}
