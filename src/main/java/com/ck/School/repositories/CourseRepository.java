package com.ck.School.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ck.School.models.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
	List<Course> findAll();
	
	@Query(value="SELECT * FROM courses ORDER BY Priority ASC", nativeQuery=true)
	List<Course> findAllPriorityLowToHigh(); 
	@Query(value="SELECT * FROM courses ORDER BY Capacity DESC", nativeQuery=true)
	List<Course> findAllHighToLow(); 
}
