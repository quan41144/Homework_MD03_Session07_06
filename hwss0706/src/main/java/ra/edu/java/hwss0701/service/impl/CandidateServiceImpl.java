package ra.edu.java.hwss0701.service.impl;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ra.edu.java.hwss0701.model.dto.request.CandidateCreateDTO;
import ra.edu.java.hwss0701.model.dto.request.CandidateUpdateDTO;
import ra.edu.java.hwss0701.model.entity.Candidate;
import ra.edu.java.hwss0701.repository.CandidateRepository;
import ra.edu.java.hwss0701.service.CandidateService;
@Service
@RequiredArgsConstructor
public class CandidateServiceImpl implements CandidateService {
    private final CandidateRepository candidateRepository;
    @Override
    public Candidate createCandidate(CandidateCreateDTO candidateCreateDTO) {
        Candidate candidate = Candidate.builder()
                .fullName(candidateCreateDTO.getFullName())
                .email(candidateCreateDTO.getEmail())
                .age(candidateCreateDTO.getAge())
                .yearsOfExperience(candidateCreateDTO.getYearsOfExperience())
                .phone(candidateCreateDTO.getPhone())
                .build();
        return candidateRepository.save(candidate);
    }

    @Override
    public Candidate updateCandidate(Long id, CandidateUpdateDTO candidateUpdateDTO) {
        Candidate candidate = candidateRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Candidate not found!"));
        candidate.setAddress(candidateUpdateDTO.getAddress());
        candidate.setBio(candidateUpdateDTO.getBio());
        return candidateRepository.save(candidate);
    }
}
