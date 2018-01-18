package com.test.controller;


import com.test.exception.ResponseErrorMessage;
import com.test.exception.UserNotFoundException;
import com.test.exception.UserNameExistException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class ExceptionController {

    @ExceptionHandler(UserNotFoundException.class)
    public ModelAndView handleUserNotFoundException(UserNotFoundException exception){
        ResponseErrorMessage message = new ResponseErrorMessage();
        message.setCode(HttpStatus.BAD_REQUEST);
        message.setMessage(exception.getMessage());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("400");
        modelAndView.addObject("message", message);
        return modelAndView;
    }

    @ExceptionHandler(UsernameNotFoundException.class)
    public ModelAndView handleUsernameNotFoundException(UserNotFoundException exception){
        ResponseErrorMessage message = new ResponseErrorMessage();
        message.setCode(HttpStatus.UNAUTHORIZED);
        message.setMessage(exception.getMessage());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("401");
        modelAndView.addObject("message", message);
        return modelAndView;
    }

    @ExceptionHandler(UserNameExistException.class)
    public ModelAndView handleUsernameExistException(UserNameExistException exception) {
        ResponseErrorMessage message = new ResponseErrorMessage();
        message.setCode(HttpStatus.CONFLICT);
        message.setMessage(exception.getMessage());

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("409");
        modelAndView.addObject("message", message);
        return modelAndView;
    }

}
