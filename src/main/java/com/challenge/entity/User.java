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
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class User {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@NotNull
	@Column(name="full_name")
	@Size(max = 100)
	private String fullName;
	
	@Email
	@NotNull
	@Column(name="email")
	@Size(max = 100)
	private String email;
	
	@NotNull
	@Column(name="nick_name")
	@Size(max = 50)
	private String nickName;
	
	@NotNull
	@Column(name="password")
	@Size(max = 255)
	private String password;
	
	@CreatedDate
	@Column(name="created_at")
	private Date createdAt;
	
    @OneToMany
    private List<Candidate> candidates;	

    @OneToMany
    private List<Submission> submissions;

}
