package com.test.service;

import com.test.entity.UsersEntity;
import com.test.exception.ConfirmationException;
import com.test.exception.TokenInvalidException;
import com.test.exception.UserNotFoundException;
import com.test.exception.UserNameExistException;
import com.test.model.RegisterTemp;
import com.test.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Base64;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Autowired
    private PasswordEncoder encoder;

    @Autowired
    private EmailService emailService;

    @Autowired
    private JwtTokenService jwtTokenService;


    @Override
    public UsersEntity getUserById(String id) throws UserNotFoundException {
        if(usersRepository.findOne(id) == null)
            throw new UserNotFoundException("User does not exists.");
        return usersRepository.findOne(id);
    }

    @Override
    public void updateUser(UsersEntity curUser) throws UserNameExistException {
        UsersEntity user = usersRepository.findByEmail(curUser.getEmail());
        user.setAccessToken(curUser.getAccessToken());
        usersRepository.save(user);
    }

    @Override
    public void register(UsersEntity user) {
        saveUser(user);
        emailService.sendMailConfirmation(user);
    }

    @Override
    public void confirmRegistration(String token) throws UserNotFoundException, TokenInvalidException, UserNameExistException, ConfirmationException {
        String userId = jwtTokenService.verifyToken(token);
        UsersEntity user = getUserById(userId);
        if(user == null) {
            throw new TokenInvalidException("Token Invalid");
        }
        user.setAccessToken(Base64.getEncoder().encode(token.getBytes()));
        updateUser(user);
    }

    @Override
    public void saveUser(UsersEntity curUser) {
        curUser.setPassword(encoder.encode(curUser.getPassword()));
        usersRepository.save(curUser);
    }


}
