package com.example.springbootmybatis.wang.resposity;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;

@Setter
@Getter
@ToString
public class FirstResposity {
    private long id;
    private String userName;
    private String password;
    private String userSex;
    private String nickName;

    public FirstResposity(String userName, String password, String userSex, String nickName) {
        this.userName = userName;
        this.password = password;
        this.userSex = userSex;
        this.nickName = nickName;
    }

    public FirstResposity(long id, String userName, String password, String userSex, String nickName) {
        this.id = id;
        this.userName = userName;
        this.password = password;
        this.userSex = userSex;
        this.nickName = nickName;
    }
}
