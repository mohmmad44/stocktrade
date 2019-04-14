package com.slml.test.servicesImpl;

import java.util.ArrayList;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import com.slml.test.dto.SlmlDTO;
import com.slml.test.model.ModelOutput;
import com.slml.test.repository.SlmlRepository;
import com.slml.test.services.Services;

@Service
public class SlmlServiceImpl implements Services {

	private final Logger LOG = LoggerFactory.getLogger(this.getClass());
	@Autowired
	SlmlRepository slmlRepository;

	@Override
	public List<SlmlDTO> getAllSecurities() {

		List<SlmlDTO> slmlDtoList = new ArrayList<>();

		List<ModelOutput> modelOuptlist = slmlRepository.findAll();

		if (!CollectionUtils.isEmpty(modelOuptlist)) {
			for (ModelOutput modelOut : modelOuptlist) {

				SlmlDTO dto = new SlmlDTO();

				if (modelOut != null) {

					LOG.info("Security name::::::" + modelOut.getSecurityName());
					dto.setDateStr(modelOut.getDateStr());
					dto.setId(modelOut.getId());
					dto.setIsin(modelOut.getIsin());
					dto.setModelEoD(modelOut.getModelEoD());
					dto.setTimeStamp(modelOut.getTimeStamp());
					dto.setSecurityName(modelOut.getSecurityName());
					dto.setYesterdayActual(modelOut.getYesterdayActual());
					dto.setNgtPublished(modelOut.getNgtPublished());
					dto.setModelNow(modelOut.getModelNow());
					slmlDtoList.add(dto);
				}

			}
		} else {
			LOG.error("modelOuptlist list is empty");
		}

		return slmlDtoList;
	}
	
	public void saveDto(SlmlDTO slmlDto) {
		
		ModelOutput modeloutput = new ModelOutput();
		modeloutput.setDateStr(slmlDto.getDateStr());
		
		modeloutput.setIsin(slmlDto.getIsin());
		modeloutput.setModelEoD(slmlDto.getModelEoD());
		modeloutput.setTimeStamp(slmlDto.getTimeStamp());
		modeloutput.setSecurityName(slmlDto.getSecurityName());
		modeloutput.setYesterdayActual(slmlDto.getYesterdayActual());
		modeloutput.setNgtPublished(slmlDto.getNgtPublished());
		modeloutput.setModelNow(slmlDto.getModelNow());
		slmlRepository.save(modeloutput);
	}

	public void deleteSecurity(Integer id) {
		slmlRepository.delete(id);;
		
	}

}
