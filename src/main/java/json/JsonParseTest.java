package json;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.PropertyNamingStrategy;
import com.alibaba.fastjson.parser.ParserConfig;
import json.bean.Test;
import json.bean.TestBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author zhouzf32074
 * @Classname JsonParseTest
 * @Description TODO
 * @Date 2021/4/19 13:49
 */
public class JsonParseTest {
    public static void main(String[] args) {
        //配置驼峰下滑线转换
//        ParserConfig.getGlobalInstance().propertyNamingStrategy= PropertyNamingStrategy.SnakeCase;
//        TestBean testBean = JSON.parseObject("{\"age_b\":12,\"name_a\":\"sss\"}", TestBean.class);
//        System.out.println(testBean);
        Integer[] x1=new Integer[]{1,2};
        Integer[]x2=new Integer[]{2,3};

        List<Integer> integers = Arrays.asList(1, 2, 3);

        Test test = new Test();
        test.setTest(new ArrayList<Integer[]>(){{
            add(x1);
            add(x2);
        }});
        test.setTesti(integers);
        String s = JSON.toJSONString(test);
        System.out.println(s);


    }
}
