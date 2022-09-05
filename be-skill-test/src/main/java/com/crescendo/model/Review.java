package com.crescendo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity

public class Review {
	@Id	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
   private int id;
   private int bid;
   private String text;
   private float rating;
   private String createdDateTime;

   
   public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getBid() {
	return bid;
}
public void setBid(int bid) {
	this.bid = bid;
}
public String getText() {
	return text;
}
public void setText(String text) {
	this.text = text;
}
public float getRating() {
	return rating;
}
public void setRating(float rating) {
	this.rating = rating;
}
public String getCreatedDateTime() {
	return createdDateTime;
}
public void setCreatedDateTime(String createdDateTime) {
	this.createdDateTime = createdDateTime;
}
   
}
