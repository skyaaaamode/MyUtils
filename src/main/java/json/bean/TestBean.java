package json.bean;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * @author zhouzf32074
 * @Classname TestBean
 * @Description TODO
 * @Date 2021/4/19 14:54
 */
public class TestBean {

    private String nameA;
    private Integer ageB;

    public String getNameA() {
        return nameA;
    }

    @Override
    public String toString() {
        return "TestBean{" +
                "nameA='" + nameA + '\'' +
                ", ageB=" + ageB +
                '}';
    }

    public void setNameA(String nameA) {
        this.nameA = nameA;
    }

    public Integer getAgeB() {
        return ageB;
    }

    public void setAgeB(Integer ageB) {
        this.ageB = ageB;
    }
}
