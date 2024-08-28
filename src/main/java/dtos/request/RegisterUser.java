package dtos.request;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class RegisterUser {
    private String name;
    private String phoneNumber;
    private String emailAddress;
}
