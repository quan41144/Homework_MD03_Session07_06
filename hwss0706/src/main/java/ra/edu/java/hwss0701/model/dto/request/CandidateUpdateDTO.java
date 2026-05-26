package ra.edu.java.hwss0701.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CandidateUpdateDTO {
    @NotBlank(message = "Không được để trống địa chỉ!")
    private String address;
    @NotBlank(message = "Không được để trống bio!")
    @Size(max = 200, message = "bio không vượt quá 200 ký tự!")
    private String bio;
}
