package com.test.controller;

import com.test.entity.UsersEntity;
import com.test.exception.ConfirmationException;
import com.test.exception.TokenInvalidException;
import com.test.exception.UserNotFoundException;
import com.test.exception.UserNameExistException;
import com.test.model.RegisterTemp;
import com.test.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class RegisterController {

    @Autowired
    private UserService userService;

    @GetMapping("/register")
    public ModelAndView getRegister() {
        return new ModelAndView("register", "user", new RegisterTemp());
    }

    @PostMapping("/register")
    public String handleRegister(@Valid @ModelAttribute("user") RegisterTemp registerTemp, BindingResult result) throws UserNameExistException, ConfirmationException {
        if(result.hasErrors()) {
            return "register";
        }
        UsersEntity user = new UsersEntity(registerTemp.getUsername(), registerTemp.getPassword());
        userService.register(user);
        return "confirm";
    }

    @GetMapping("/confirm")
    public String emailConfirm(@RequestParam String token) throws UserNotFoundException, TokenInvalidException, UserNameExistException, ConfirmationException {
        userService.confirmRegistration(token);
        return "redirect:/login";
    }
}
