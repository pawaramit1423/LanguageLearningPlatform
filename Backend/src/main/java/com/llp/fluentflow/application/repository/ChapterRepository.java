package com.llp.fluentflow.application.repository;

import org.springframework.data.repository.CrudRepository;

import com.llp.fluentflow.application.model.Chapter;

import java.util.List;

public interface ChapterRepository extends CrudRepository<Chapter, Integer>
{
	public List<Chapter> findByCoursename(String Coursename);
	
}