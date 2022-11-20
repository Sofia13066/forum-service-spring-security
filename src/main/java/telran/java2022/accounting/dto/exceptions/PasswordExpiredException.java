package telran.java2022.accounting.dto.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import lombok.NoArgsConstructor;

@NoArgsConstructor
@ResponseStatus(HttpStatus.EXPECTATION_FAILED)
public class PasswordExpiredException extends Exception {

    private static final long serialVersionUID = 1L;



}
