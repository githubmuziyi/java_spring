package cn.muzi.ioc;

/**
 * Created by muzi on 2017/10/9.
 * 静态工厂
 */
public class UserFactory {

    public static User getUser() {
        return new User();
    }

}
