package org.example.ex31PSA.supplier;

public class Login {
    private String userName;
    private int password;

    public Login(String userName, int password) {
        this.userName = userName;
        this.password = password;
    }

    @Override
    public String toString() {
        return "Login{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public int getPassword() {
        return password;
    }
}
