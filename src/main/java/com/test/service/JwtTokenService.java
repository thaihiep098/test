package com.test.service;

import com.test.entity.UsersEntity;
import com.test.exception.ConfirmationException;
import com.test.exception.TokenInvalidException;
import com.test.exception.UserNotFoundException;
import com.test.exception.UserNameExistException;

public interface JwtTokenService {
    String getToken(UsersEntity user);

    String verifyToken(String token) throws TokenInvalidException, UserNotFoundException, UserNameExistException, ConfirmationException;
}
