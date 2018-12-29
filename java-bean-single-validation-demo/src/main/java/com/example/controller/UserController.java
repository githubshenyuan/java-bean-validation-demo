package com.example.controller;

import com.example.common.constants.ValidationConstant;
import com.example.entity.GradeEntity;
import com.example.entity.StudentEntity;
import com.example.entity.UserEntity;
import net.sf.oval.ConstraintSet;
import net.sf.oval.ConstraintViolation;
import net.sf.oval.Validator;

import java.util.ArrayList;
import java.util.List;


/**
 * @author sh on 2018/11/30 22:42
 * @version ideaIU-2018.2.3.win_home
 */
public class UserController {

    public String validate() {
        GradeEntity gradeEntity = new GradeEntity();
        Validator validator = new Validator();
        gradeEntity.setUuid("");
        gradeEntity.setGradeName("123");
        StudentEntity studentEntity = new StudentEntity();
        gradeEntity.setStudentEntity(studentEntity);
        UserEntity userEntity = new UserEntity();
        studentEntity.setUserEntity(userEntity);
        List<ConstraintViolation> constraintSets = validator.validate(gradeEntity, ValidationConstant.GENERIC_NULL_PROFILE);

        for (ConstraintViolation constraintSet : constraintSets) {
            System.out.println(constraintSet.getCauses());
        }
        System.out.println("");
        return "";
    }
}
