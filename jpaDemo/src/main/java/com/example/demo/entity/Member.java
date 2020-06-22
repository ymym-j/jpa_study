package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "member")
public class Member {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="member_id")
	private long memberId;
	
	private String userName;

	@JoinColumn(name="team_id")
	@ManyToOne(fetch=FetchType.LAZY)
	private Team team;
}
