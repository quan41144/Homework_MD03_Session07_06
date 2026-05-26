package ra.edu.java.hwss0701.model.dto.response;

import lombok.*;
import org.springframework.http.HttpStatus;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class ApiDataResponse<T> {
    private Boolean success;
    private String message;
    private T data;
    private T errors;
    private HttpStatus httpStatus;
}
