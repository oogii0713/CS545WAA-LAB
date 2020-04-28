package edu.miu.service;

import edu.miu.domain.User;
import edu.miu.repository.DataFacade;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private DataFacade dataFacade;

    @Override
    public boolean checkValidUser(User user) {

        String expectedPassword = dataFacade.findPassword(user.getName());
        if (expectedPassword.equals(user.getPassword())) {
            return true;
        }
        return false;
    }
}
