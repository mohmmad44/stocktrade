package com.slml.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slml.test.model.ModelOutput;

public interface slmlRepository extends JpaRepository<ModelOutput, Integer> {

	
	
}
