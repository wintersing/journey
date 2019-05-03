package com.lt.journey.model;

import lombok.Data;

/**
 * 用户信息
 */

@Data
public class User {
    private String id;
    private String username;
    private String password;
    private String phone;
    private String code;
}