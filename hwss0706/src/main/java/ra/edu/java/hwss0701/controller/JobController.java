package ra.edu.java.hwss0701.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ra.edu.java.hwss0701.model.dto.request.JobCreateDTO;
import ra.edu.java.hwss0701.service.JobService;

@RestController
@RequestMapping("/api/jobs")
@RequiredArgsConstructor
public class JobController {
    private final JobService jobService;
    @PostMapping
    public ResponseEntity<String> createJob(@Valid @RequestBody JobCreateDTO jobCreateDTO) {
        jobService.createJob(jobCreateDTO);
        return new ResponseEntity<>("Tạo tin tuyển dụng thành công!", HttpStatus.CREATED);
    }
}
