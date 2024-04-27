package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="FeedBack")
public class FeedBack {
	@Id
	@Column(name="feed_id")
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long feed_id;
	@Column(name="EMAIL")
	private String email;
	@Column(name="FEEDBACK")
	private String feedback;
	public long getStud_id() {
		return feed_id;
	}
	public void setStud_id(long feed_id) {
		this.feed_id = feed_id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getFeedback() {
		return feedback;
	}
	public void setFeedback(String feedback) {
		this.feedback = feedback;
	}
	public FeedBack(long feed_id, String email, String feedback) {
		super();
		this.feed_id = feed_id;
		this.email = email;
		
		this.feedback= feedback;
	}
	public FeedBack() {
		
	}

}
