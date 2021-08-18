package json.bean;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author zhouzf32074
 * @Classname User
 * @Description TODO
 * @Date 2021/4/19 13:50
 */
public class User {
    @JSONField(name = "nm",ordinal = 2)
    private String name;
    @JSONField(name = "ag",ordinal = 1)
    private Integer age;

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public static void main(String[] args) {
        String sss = JSON.toJSONString(new User("sss", 12));
        System.out.println(sss);
        User user = JSON.parseObject(sss, User.class);
        System.out.println(user);


    }
}
