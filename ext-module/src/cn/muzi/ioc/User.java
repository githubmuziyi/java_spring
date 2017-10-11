package cn.muzi.ioc;

import java.util.List;
import java.util.Map;
import java.util.Properties;

/**
 * Created by muzi on 2017/10/9.
 */
public class User {

    private String name;

    private String[] arr;

    private List<String> list;

    private Map<String, String> map;

    private Properties properties;

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

    public void setArr(String[] arr) {
        this.arr = arr;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
