package tasks.task2.model;

import tasks.task2.auth.Authenticable;

import java.util.Date;

public class User implements Authenticable {
    private String firstName;
    private String lastName;
    private Date dateOfBirth;

    private String userName;
    private String hashPassword;

    public User() {}

    public User(String firstName, String lastName, Date dateOfBirth) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public String getUserName() {
        return userName;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public String getToken() {
        return Authenticable.DEFAULT_TOKEN;
    }
}
