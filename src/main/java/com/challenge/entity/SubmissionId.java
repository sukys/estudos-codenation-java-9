package com.challenge.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Embeddable
public class SubmissionId implements Serializable  {

	private static final long serialVersionUID = 7435972505983480220L;

	@NotNull
	@ManyToOne
	private User userId;

	@NotNull
	@ManyToOne
	private Challenge challengeId;	
	
}
