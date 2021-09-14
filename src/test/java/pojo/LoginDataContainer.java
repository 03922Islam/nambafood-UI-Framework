package pojo;

public class LoginDataContainer {

    private String userName;
    private String passWord;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return passWord;
    }

    public void setPassword(String password) {
        this.passWord = password;
    }

    @Override
    public String toString() {
        return "LoginDataContainer{" +
                "userName='" + userName + '\'' +
                ", password='" + passWord + '\'' +
                '}';
    }
}
