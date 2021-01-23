package org.sominda.sample.spring.app.model;

/**
 * This is a model of the user object with its attributes.
 */
public class User {

    private String username;
    private String userId;

    public User() {

    }

    public User(String username, String userId) {

        this.username = username;
        this.userId = userId;
    }

    public String getUsername() {

        return username;
    }

    public void setUsername(String username) {

        this.username = username;
    }

    public String getUserId() {

        return userId;
    }

    public void setUserId(String userId) {

        this.userId = userId;
    }
}

