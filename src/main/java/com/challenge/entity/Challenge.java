package com.challenge.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Challenge {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull
	@Column(name="name")
	@Size(max = 100)
	private String name;
	
	@NotNull
	@Column(name="slug")
	@Size(max = 50)
	private String slug;
	
	@CreatedDate
	@Column(name="created_at")
	private Date createdAt;
	
	@OneToMany
	private List<Acceleration> accelerations;

	@OneToMany
	private List<Submission> submissions;
	
}
