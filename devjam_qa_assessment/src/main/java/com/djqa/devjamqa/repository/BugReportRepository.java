package com.djqa.devjamqa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.djqa.devjamqa.entity.BugReportDao;


@Repository
public interface BugReportRepository extends CrudRepository<BugReportDao, Long>{

}
