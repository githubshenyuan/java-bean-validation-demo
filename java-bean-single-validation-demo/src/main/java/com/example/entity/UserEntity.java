package com.example.entity;

//import javax.validation.constraints.NotNull;

import net.sf.oval.constraint.NotNull;

/**
 * @author sh on 2018/11/30 22:41
 * @version ideaIU-2018.2.3.win_home
 */
public class UserEntity {
    @NotNull(message = "userUuid 不能为空", profiles = {"userUuid"})
    private String uuid;
    //@NotNull(message = "用户名不能为空")
    private String username;
    //@NotNull(message = "密码不能为空")
    private String password;

    private int age;


    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
