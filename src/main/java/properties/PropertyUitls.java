package properties;

import javax.swing.*;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 37587
 * @version 1.0
 * @date 2020/6/4 23:00
 * @description
 */
public class PropertyUitls {

    public static Object getByname(Class T,String filename,String index){
        Properties properties = new Properties();
        InputStream is = T.getClassLoader().getResourceAsStream(filename);
        try {
            properties.load(is);
        } catch (IOException e) {
            e.printStackTrace();
        }
        String property = properties.getProperty(index);
        return property;
    }

    //TODO 写proerties文件

}
