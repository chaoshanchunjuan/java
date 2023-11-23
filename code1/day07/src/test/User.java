package test;

public class User {
    private String name;
    private int password;
    private int email;


    public User() {
    }

    public User(String name, int password, int email) {
        this.name = name;
        this.password = password;
        this.email = email;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return password
     */
    public int getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(int password) {
        this.password = password;
    }

    /**
     * 获取
     * @return email
     */
    public int getEmail() {
        return email;
    }

    /**
     * 设置
     * @param email
     */
    public void setEmail(int email) {
        this.email = email;
    }

    public String toString() {
        return "User{name = " + name + ", password = " + password + ", email = " + email + "}";
    }
}
