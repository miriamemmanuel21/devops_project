package services;

import dtos.request.RegisterUser;
import dtos.response.RegisterUserResponse;
import org.springframework.stereotype.Service;

@Service
public interface UserService {
    RegisterUserResponse register(RegisterUser RegisterUser);

}
