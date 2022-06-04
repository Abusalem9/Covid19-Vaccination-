package com.covid.vaccination.Service;

import com.covid.vaccination.Entity.User;
import com.covid.vaccination.Exception.UserException;

import java.util.List;

public interface UserService {
    void saveUser(User user);

    User getUserById(Integer id) throws UserException;

    List<User> getAllUsers() throws UserException;

    User deleteUserById(Integer id) throws UserException;

    User updateUser(User user) throws UserException;

    User updateUser(User user, String key) throws UserException;
}
