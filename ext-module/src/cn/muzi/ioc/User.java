package cn.muzi.ioc;

/**
 * Created by muzi on 2017/10/9.
 */
public class User {

    private String name;

    public User() {}

    public User(String name) {
        this.name = name;
    }

    public void add() {
        System.out.println("User add");
    }

    public void userName() {
        System.out.println("user name is " + name);
    }

    public void setName(String name) {
        this.name = name;
    }
}
