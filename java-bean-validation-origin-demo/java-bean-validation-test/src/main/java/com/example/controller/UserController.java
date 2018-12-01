package com.example.controller;

import com.example.entity.UserEntity;

import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

/**
 * @author sh on 2018/11/30 23:01
 * @version ideaIU-2018.2.3.win_home
 */
public class UserController {
    public String validate() {
        UserEntity userEntity = new UserEntity();
        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();
        validator.validate(userEntity);
        System.out.println("");

        return "";
    }
}
