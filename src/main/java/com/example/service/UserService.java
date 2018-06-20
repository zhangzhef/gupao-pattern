package com.example.service;

import com.example.pojo.User;

import java.util.List;

/**
 * @author zzf
 * @date 18/5/6 18:56.
 */
public interface UserService {

    List<User> find(int age);
}
