package edu.miu.service;

import edu.miu.data.DataFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private DataFacade dataFacade;

    @Override
    public boolean checkValidUser(String username, String password) {

        String expectedPassword = dataFacade.findPassword(username);
        if (expectedPassword.equals(password)) {
            return true;
        }
        return false;
    }
}
