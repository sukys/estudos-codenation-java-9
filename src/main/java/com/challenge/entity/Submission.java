package com.challenge.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.Data;

@Data
@Entity
@EntityListeners(AuditingEntityListener.class)
public class Submission {

	@EmbeddedId
	private SubmissionId submissionId;
	
	@NotNull
	@Column(name = "score")
	private Float score;

	@NotNull
	@CreatedDate
	@Column(name = "created_at")
	private Date createdAt;

}
