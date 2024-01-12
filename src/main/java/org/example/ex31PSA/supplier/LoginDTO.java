package org.example.ex31PSA.supplier;

public class LoginDTO {
    private String userName;
    private int password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "LoginDTO{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                '}';
    }
}
