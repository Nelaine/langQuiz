package main.java.com.apan.langquiz.model;

import java.util.Date;

/**
 * Created by Agnieszka on 2017-12-23.
 */
public class Person {

    String id;
    String username;
    String firstName;
    String lastName;
    Date joinedOnDate;
    Date birthDate;
    Role role;
    Dictionary gender;
    Dictionary country;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getJoinedOnDate() {
        return joinedOnDate;
    }

    public void setJoinedOnDate(Date joinedOnDate) {
        this.joinedOnDate = joinedOnDate;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public Dictionary getGender() {
        return gender;
    }

    public void setGender(Dictionary gender) {
        this.gender = gender;
    }

    public Dictionary getCountry() {
        return country;
    }

    public void setCountry(Dictionary country) {
        this.country = country;
    }
}
