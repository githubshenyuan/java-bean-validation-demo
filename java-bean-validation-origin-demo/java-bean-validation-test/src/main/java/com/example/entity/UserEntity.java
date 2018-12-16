package com.example.entity;

import javax.validation.constraints.NotNull;

/**
 * @author sh on 2018/11/30 23:01
 * @version ideaIU-2018.2.3.win_home
 */
public class UserEntity {
    @NotNull(message = "唯一码不能为空")
    private String uuid;
    @NotNull(message = "用户名 不能为空")
    private String usernaem;
}
