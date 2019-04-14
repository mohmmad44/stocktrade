package com.slml.test.controller;




import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.slml.test.dto.SlmlDTO;
import com.slml.test.dto.SlmlResponseDTO;
import com.slml.test.servicesImpl.SlmlServiceImpl;

@RestController
public class SlmlController {

	@Autowired
	SlmlServiceImpl slmlServiceImpl;
	
	@GetMapping("/getallsecurities")
	public SlmlResponseDTO getAllSecurities() {

		SlmlResponseDTO responseDTO = new SlmlResponseDTO();
		List<SlmlDTO> slmlList = slmlServiceImpl.getAllSecurities();
		
		responseDTO.setSlmlList(slmlList);
		return responseDTO;

	}
	
	@PostMapping("/savesecurity")
	public void saveSecurity(@RequestBody SlmlDTO slmlDto) {
		
		slmlServiceImpl.saveDto(slmlDto);
		
	
		
	}
	

}
