package com.example;

import com.example.entity.ValiBean;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

/**
 * @author sh on 2018/11/25 20:08
 * @version ideaIU-2018.2.3.win_home
 */
public class Validate {
    public static void main(String[] args) {

        ValidatorFactory validatorFactory = Validation.buildDefaultValidatorFactory();
        Validator validator = validatorFactory.getValidator();

        ValiBean valiBean = new ValiBean();

        Set<ConstraintViolation<ValiBean>> set = validator.validate(valiBean);

        System.out.println("");

    }
}
