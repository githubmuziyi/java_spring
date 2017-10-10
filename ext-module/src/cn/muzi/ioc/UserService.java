package cn.muzi.ioc;

/**
 * Created by muzi on 2017/10/9.
 * 对象属性注入
 */
public class UserService {

    private UserDao userDao;

    public void add() {
        System.out.println("service add");
        userDao.add();
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }
}
