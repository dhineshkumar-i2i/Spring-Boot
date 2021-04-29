package com.test.trial.service;

import com.test.trial.modl.User;
import com.test.trial.repository.HibernateRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userService {

    @Autowired
    HibernateRepo hibernateRepo;

    public List<User> getAll() {
        return (List<User>) hibernateRepo.findAll();
    }
    
    public User getById(int userId) {
        return hibernateRepo.findById(userId).orElse(null);
    }

    public void createUser(String userName) {
        hibernateRepo.save(new User(userName));
    }

    public void deleteUser(int userId) {
        hibernateRepo.deleteById(userId);
    }

    public void updateUser(int userId, String userName) {
        User user = hibernateRepo.findById(userId).orElse(null);
        user.setName(userName);
        hibernateRepo.save(user);
    }
}
