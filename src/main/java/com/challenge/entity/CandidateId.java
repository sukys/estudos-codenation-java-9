package com.challenge.entity;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import lombok.Data;

@Data
@Embeddable
public class CandidateId implements Serializable  {

	private static final long serialVersionUID = 4916645220029275364L;

	@NotNull
	@ManyToOne
	private User user;

	@NotNull
	@ManyToOne
	private Acceleration acceleration;

	@NotNull
	@ManyToOne
	private Company company;
	
}
