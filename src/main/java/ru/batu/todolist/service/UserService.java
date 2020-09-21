package ru.batu.todolist.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.batu.todolist.persist.entity.User;
import ru.batu.todolist.persist.repo.UserRepository;
import ru.batu.todolist.repr.UserRepr;

import javax.transaction.Transactional;

@Service
@Transactional
public class UserService {
    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public void createNewUser(UserRepr userRepr){
        User user = new User();
        user.setUsername(userRepr.getUsername());
        user.setPassword(userRepr.getPassword());
        userRepository.save(user);
    }
}
