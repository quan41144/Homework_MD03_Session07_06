package ra.edu.java.hwss0701.advice;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import ra.edu.java.hwss0701.model.dto.response.ApiDataResponse;

import java.util.HashMap;
import java.util.Map;

@RestControllerAdvice
public class CandidateAdvice {
    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<ApiDataResponse<Map<String, String>>> handleValidationExceptions(MethodArgumentNotValidException ex) {
        Map<String, String> errors = new HashMap<>();
        for (FieldError fieldError : ex.getBindingResult().getFieldErrors()) {
            errors.put(fieldError.getField(), fieldError.getDefaultMessage());
        }
        return new ResponseEntity<>(new ApiDataResponse<>(
                false,
                "Dữ liệu không hợp lệ!",
                null,
                errors,
                HttpStatus.BAD_REQUEST
        ), HttpStatus.BAD_REQUEST);
    }
}
