package com.slml.test.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.slml.test.dto.SlmlDTO;
import com.slml.test.model.ModelOutput;

public interface SlmlRepository extends JpaRepository<ModelOutput, Integer> {



	
	
}
