package cn.muzi.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by muzi on 2017/10/9.
 * spring:
 *  IOC: 控制反转
 *  bean实例化的三种方式
 *      1.使用类的无参构造函数创建 （推荐）
 *      2.使用静态工厂创建
 *      2.使用实例工厂创建
 *  bean标签属性:
 *      1.id属性 根据id值得到配置对象 不能包含特殊符号
 *      2.class属性 创建对象所在类的全路径
 *      3.name属性 和id功能一样，但是可以包含特殊符号
 *      4.scope属性 bean的作用范围
 *          1.singleton 默认值 单例的
 *          2.prototype 多例的
 *          3.request web项目中，spring创建一个Bean对象，将对象存入到request域中
 *          4.session web项目中，spring创建一个Bean对象，将对象存入到session域中
 *          5.globalSession web项目中，spring创建一个Bean对象，将对象存入到globalSession域中
 *
 *  属性注入：（spring只支持前两种参数注入方式）
 *      1.set方法注入 (最常见)
 *      2.有参构造方法注入
 *      3.接口注入
 */
class IOCTest {

    public static void main(String[] args) {
        //加载spring配置文件，根据配置创建对象
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        //得到配置创建的对象
        User user = (User) context.getBean("user");
        System.out.println(user);
        user.add();
        //静态工厂
        User user1 = (User) context.getBean("user2");
        System.out.println(user1);
        user1.add();
        //实例工厂
        User user2 = (User) context.getBean("user3");
        System.out.println(user2);
        user2.add();

        //有参构造注入
        User user3 = (User) context.getBean("user4");
        user3.userName();

        //set方法注入
        User user4 = (User) context.getBean("user5");
        user4.userName();

        //对象属性注入
        UserService userService = (UserService) context.getBean("userService");
        userService.add();

        //p名称空间注入
        User user5 = (User) context.getBean("user6");
        System.out.println(user5);
        user5.add();
    }
}
