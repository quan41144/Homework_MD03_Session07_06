package ra.edu.java.hwss0701.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ra.edu.java.hwss0701.model.entity.Candidate;
@Repository
public interface CandidateRepository extends JpaRepository<Candidate, Long> {
}
