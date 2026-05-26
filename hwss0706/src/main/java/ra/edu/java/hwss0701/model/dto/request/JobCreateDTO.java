package ra.edu.java.hwss0701.model.dto.request;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class JobCreateDTO {
    @NotBlank(message = "Không được để trống tiêu đề công việc!")
    private String title;
    @NotNull(message = "Không được để trống thông tin công ty!")
    @Valid
    private CompanyDTO company;
    @Min(value = 0, message = "Lương tối thiểu không được là số âm!")
    private Double salaryMin;
    @Min(value = 0, message = "Lương tối thiểu không được là số âm!")
    private Double salaryMax;
}
