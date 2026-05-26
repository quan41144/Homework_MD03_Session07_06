package ra.edu.java.hwss0701.model.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class CompanyDTO {
    @NotBlank(message = "Không được để trống tên công ty!")
    private String name;
    @Size(min = 10, max = 13, message = "Mã sô thuế phải từ 10 đến 13 ký tự!")
    private String taxCode;
}
