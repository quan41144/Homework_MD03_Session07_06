package ra.edu.java.hwss0701.model.dto.request;

import jakarta.validation.constraints.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CandidateCreateDTO {
    @NotBlank(message = "Không được để trống tên!")
    private String fullName;
    @NotBlank(message = "Không được để trống email!")
    @Email(message = "Phải đúng định dạng email!")
    private String email;
    @NotNull(message = "Không được để trống tuổi!")
    @Min(value = 18, message = "Tuổi phải tối thiểu 18 tuổi!")
    private Integer age;
    @NotNull(message = "Không được để trống số năm kinh nghiệm!")
    @Min(value = 0, message = "Số năm kinh nghiệm không được âm!")
    private Integer yearsOfExperience;
    @NotBlank(message = "Không được để trống số điện thoại!")
    @Pattern(regexp = "^0\\d{9}$", message = "Số điện thoại không hợp lệ!")
    private String phone;
}
