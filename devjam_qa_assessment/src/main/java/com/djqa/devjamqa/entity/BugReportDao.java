package com.djqa.devjamqa.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Entity
@Table
@AllArgsConstructor
@Data
public class BugReportDao {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String bugDescription;
	private String pageTitle;

}
