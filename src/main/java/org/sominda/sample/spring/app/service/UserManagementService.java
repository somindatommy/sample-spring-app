package org.sominda.sample.spring.app.service;

import org.sominda.sample.spring.app.model.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class UserManagementService {

    List<User> userList = new ArrayList<>(Arrays.asList(new User("Joy", "1234-scdw2-2fcevw342-2323"),
            new User("Chandler", "3454-2csfdfd-sfdvsdjv-7623")));

    public List<User> getUserList() {

        return userList;
    }

    public void addUserList(User user) {

        userList.add(user);
    }

    public String getUerId(String username) {
        for (User user : userList) {
            if (user.getUsername().equals(username)) {
                return user.getUserId();
            }
        }
        return "";
    }
}
