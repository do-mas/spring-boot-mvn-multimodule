package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repo.User;
import repo.UserRepository;

@Service
public class UserService {

    @Autowired private UserRepository userRepository;

    public String getUserName(Long userId) {
        User user = userRepository.findOne(userId);
        return user.getName();
    }

}
