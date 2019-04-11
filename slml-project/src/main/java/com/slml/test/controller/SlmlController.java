package com.slml.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.slml.test.dto.SlmlResponseDTO;

@RestController
public class SlmlController {

	
	
	@GetMapping("/getallsecurities")
	public SlmlResponseDTO getAllSecurities() {

		SlmlResponseDTO responseDTO = new SlmlResponseDTO();

		return responseDTO;

	}

}
