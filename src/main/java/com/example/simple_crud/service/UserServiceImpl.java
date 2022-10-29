package com.example.simple_crud.service;

import com.example.simple_crud.model.User;
import com.example.simple_crud.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{


    public final UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
//        User user1 = User.builder()
//                .fullName(user.getFullName())
//                .emailAddress(user.getEmailAddress())
//                .phoneNumber(user.getPhoneNumber())
//                .build();
//            user1 = userRepository.save(user1);
//        User user1 = new User();
//        user1.setFullName(user.getFullName());
//        user1.setEmailAddress(user.getEmailAddress());
//        user1.setPhoneNumber(user.getPhoneNumber());
        return userRepository.save(user);

    }

//    @Override
//    public User update(Long id, String fullname) {
//        User userNew = userRepository.findById(id).orElseThrow(() -> new RuntimeException ());
//
//        userNew.setFullName(fullname);
//        userRepository.save(userNew);
//        return userNew;
//    }

    @Override
    public User update(Long id, User user) {
        User userNew = userRepository.findById(id).orElseThrow(() -> new RuntimeException ());
        userNew.setPhoneNumber(user.getPhoneNumber());
        userNew.setEmailAddress(user.getEmailAddress());
        userNew.setFullName(user.getFullName());
        userRepository.save(userNew);
        return userNew;
    }

    @Override
    public void delete(Long id) {
        User user1 = userRepository.findById(id).orElseThrow(() -> new RuntimeException());
        userRepository.delete(user1);
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
