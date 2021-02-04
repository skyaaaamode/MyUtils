package BeanConvert;

import popj.User;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouzf32074
 * @Classname MapToBean
 * @Description TODO
 * @Date 2021/2/2 17:04
 */
public class MapToBean {
    public static <T> T mapToObject(HashMap<Object, Object> map, Class<T> beanClass) throws Exception {
        if (map == null) {
            return null;
        }

        T obj = beanClass.newInstance();

        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field field : fields) {
            int mod = field.getModifiers();
            if (Modifier.isStatic(mod) || Modifier.isFinal(mod)) {
                continue;
            }

            field.setAccessible(true);
            field.set(obj, map.get(field.getName()));
        }

        return obj;
    }

    public static Map<String, Object> objectToMap(Object obj) throws Exception {
        if (obj == null) {
            return null;
        }

        Map<String, Object> map = new HashMap<String, Object>();

        Field[] declaredFields = obj.getClass().getDeclaredFields();
        for (Field field : declaredFields) {
            field.setAccessible(true);
            map.put(field.getName(), field.get(obj));
        }

        return map;
    }
    public static void main(String[] args) {
        HashMap<Object, Object> objectObjectHashMap = new HashMap<Object, Object>(){
            {
                put("name","zzf");
                put("age",123);
            }
        };
        User o=null;
        try {
             o = mapToObject(objectObjectHashMap, User.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(o.toString());
    }

}
