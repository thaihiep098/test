package com.test.service;

import com.test.entity.UsersEntity;
import com.test.exception.ConfirmationException;
import com.test.exception.TokenInvalidException;
import com.test.exception.UserNameExistException;
import com.test.exception.UserNotFoundException;

public interface UserService {
    UsersEntity getUserById(String id) throws UserNotFoundException;
    void updateUser(UsersEntity user) throws UserNameExistException;
    void register(UsersEntity user) throws UserNameExistException, ConfirmationException;
    void confirmRegistration(String token) throws UserNotFoundException, TokenInvalidException, UserNameExistException, ConfirmationException;
    void saveUser(UsersEntity user) throws UserNameExistException, ConfirmationException;
}
