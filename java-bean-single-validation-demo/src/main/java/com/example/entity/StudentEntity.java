package com.example.entity;

import net.sf.oval.constraint.AssertValid;
import net.sf.oval.constraint.NotNull;

import java.util.Date;

/**
 * @author sh 2018/12/16 16:01
 * @version ideaIU-2018.2.5.win
 */
public class StudentEntity {
    @NotNull(message = "studentUuid 不能为空", profiles = {"studentUuid"})
    private String uuid;
    @NotNull(message = "realName 不能为空", profiles = {"realName"})
    private String realName;
    @NotNull(message = "sex 不能为空", profiles = {"sex"})
    private boolean sex;
    @NotNull(message = "birthDay 不能为空", profiles = {"birthDay"})
    private String birthDay;
    @NotNull(message = "age 不能为空", profiles = {"age"})
    private int age;
    @NotNull(message = "userEntity 不能为空", profiles = {"userEntity"})
    @AssertValid(profiles = {"userEntity"})
    private UserEntity userEntity;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public boolean isSex() {
        return sex;
    }

    public void setSex(boolean sex) {
        this.sex = sex;
    }

    public String getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public UserEntity getUserEntity() {
        return userEntity;
    }

    public void setUserEntity(UserEntity userEntity) {
        this.userEntity = userEntity;
    }
}
