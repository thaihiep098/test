package com.test.service;

import com.test.entity.UsersEntity;

public interface EmailService {
    void sendMailConfirmation(UsersEntity user);
}
