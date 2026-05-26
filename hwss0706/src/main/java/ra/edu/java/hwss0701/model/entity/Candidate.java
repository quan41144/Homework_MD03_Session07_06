package ra.edu.java.hwss0701.model.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "candidates")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Candidate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "full_name", length = 100, nullable = false)
    private String fullName;
    @Column(name = "email", length = 100, nullable = false)
    private String email;
    @Column(name = "age")
    private Integer age;
    @Column(name = "year_of_experience")
    private Integer yearsOfExperience;
    @Column(name = "address", length = 100)
    private String address;
    @Column(name = "bio", length = 100)
    private String bio;
    @Column(name = "phone", length = 11)
    private String phone;
}
