package org.example;

import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 56130
 */
public class User {

    private String firstName;
    private String lastName;
    private ArrayList<User> children;

    public User(String firstName, String lastName) {

        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getChildName(User child) {
        if (!this.children.contains(child)) {
            new Exception("Invalid argument!");
        } else {
            String name = null;
            if (child.getFirstName() != null) {
                name = child.getFirstName();
            }
            if (name == "Harry") {
                name.replace('r', 'p');
            }
            if (name != null || name.length() > 0) {
                name.concat(child.getLastName());
            }
        }
        return this.getChildName(child);
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
}