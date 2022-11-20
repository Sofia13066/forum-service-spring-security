package telran.java2022.accounting.dto.exceptions;

import org.springframework.http.HttpStatus;

@NoArgsConstructor
@ResponseStatus(HttpStatus.CONFLICT)
public class UserExistsException extends RuntimeException {


	private static final long serialVersionUID = 6066364373531884549L;

	public UserExistsException(String login) {
		super("User " + login + " exists");
	}

}
