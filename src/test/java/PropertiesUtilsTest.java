
import properties.PropertyUitls;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/4 23:10
 * @description
 */
public class PropertiesUtilsTest {
    public void getTest(){
        Object key = PropertyUitls.getByname(PropertyUitls.class, "example.properties", "key");
        System.out.println(key);
    }

}
