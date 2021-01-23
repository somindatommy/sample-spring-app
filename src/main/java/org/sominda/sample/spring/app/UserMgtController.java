package org.sominda.sample.spring.app;

import org.sominda.sample.spring.app.model.User;
import org.sominda.sample.spring.app.service.UserManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UserMgtController {

    @Autowired
    UserManagementService userManagementService;

    @RequestMapping("/users")
    public User[] getUserList() {
        return userManagementService.getUserList().toArray(new User[0]);
    }

    @RequestMapping(value = "/users/add", method = RequestMethod.POST)
    public void addUser(@RequestBody User user) {
        userManagementService.addUserList(user);
    }

    @RequestMapping("/users/{Username}")
    public String getUserId(@PathVariable("Username") String username){
        return userManagementService.getUerId(username);
    }
}
