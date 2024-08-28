package dtos.response;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RegisterUserResponse {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String message;
}
