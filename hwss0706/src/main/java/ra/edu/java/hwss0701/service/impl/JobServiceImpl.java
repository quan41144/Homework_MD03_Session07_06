package ra.edu.java.hwss0701.service.impl;

import org.springframework.stereotype.Service;
import ra.edu.java.hwss0701.exception.CustomValidationException;
import ra.edu.java.hwss0701.model.dto.request.JobCreateDTO;
import ra.edu.java.hwss0701.service.JobService;
@Service
public class JobServiceImpl implements JobService {
    @Override
    public void createJob(JobCreateDTO jobCreateDTO) {
        if (jobCreateDTO.getSalaryMin() > jobCreateDTO.getSalaryMax()) {
            throw new CustomValidationException("Lương tối thiểu không được lớn hơn lương tối đa!");
        }
    }
}
