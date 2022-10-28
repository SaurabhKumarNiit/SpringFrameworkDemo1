package org.example.config;

public class userMain {

    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    private long phone;

    public userMain(int userId, String firstName, String lastName, String email, long phone) {

        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "userMain{" +
                "userId=" + userId +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                '}';
    }
}
