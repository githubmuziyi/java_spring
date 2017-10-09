package cn.muzi.ioc;

/**
 * Created by muzi on 2017/10/9.
 */
public class NewUserFactory {

    public User getUser() {
        return new User();
    }
}
