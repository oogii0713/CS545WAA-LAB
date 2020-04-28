package edu.miu.service;

import edu.miu.domain.User;

import java.util.List;

public interface LoginService {
    boolean checkValidUser(User user);
}
