package com.shop.coffe.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import com.shop.coffe.dto.Review;

@Mapper
public interface ReviewDao {	
	
	public List<Review> getRecentReviews(Review r) throws Exception ;
	
	public  void insertReview(Review m) throws Exception;
	


}

