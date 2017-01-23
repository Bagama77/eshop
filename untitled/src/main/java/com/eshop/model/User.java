package com.eshop.model;
import java.util.Arrays;
import java.util.Date;

public class User extends Entity{

    private String login;
    private String name;
    private char[] password;
    private Date created;
    private UserRole role;
    private char[] phone;

    public User(){}

    public User(String login, String name, char[] password, Date created, UserRole role) {
        this.login = login;
        this.name = name;
        this.password = password;
        this.created = created;
        this.role = role;
    }

    public User(String login, String name, char[] password, Date created, UserRole role, char[] phone) {
        this.login = login;
        this.name = name;
        this.password = password;
        this.created = created;
        this.role = role;
        this.phone = phone;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }

    public UserRole getRole() {
        return role;
    }

    public void setRole(UserRole role) {
        this.role = role;
    }

    public char[] getPhone() {
        return phone;
    }

    public void setPhone(char[] phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                ", name='" + name + '\'' +
                ", password=" + Arrays.toString(password) +
                ", created=" + created +
                ", role=" + role +
                ", phone=" + Arrays.toString(phone) +
                '}';
    }
}
