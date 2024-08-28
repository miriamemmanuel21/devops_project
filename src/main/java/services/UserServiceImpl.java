package services;

import data.models.User;
import data.repositories.UserRepository;
import dtos.request.RegisterUser;
import dtos.response.RegisterUserResponse;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    public  final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public RegisterUserResponse register(RegisterUser registerUser) {
        User user = new User();
        user.setName(registerUser.getName());
        user.setPhoneNumber(registerUser.getPhoneNumber());
        user.setEmailAddress(registerUser.getEmailAddress());
        userRepository.save(user);

        RegisterUserResponse registerUserResponse = new RegisterUserResponse();
        registerUserResponse.setMessage("User Registered successfully");
        return registerUserResponse;
    }
}
