package com.i36ice.user.pojo;

import lombok.Data;

@Data
public class User {

    private Long id;

    private String username;

    private String password;

    private String wxUid;

}
