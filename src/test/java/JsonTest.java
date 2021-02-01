import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import json.bean.Crash;
import org.junit.Test;
import popj.User;

import java.math.BigDecimal;
import java.text.DecimalFormat;

/**
 * @author zhouzf32074
 * @Classname JsonTest
 * @Description TODO
 * @Date 2021/1/27 16:36
 */
public class JsonTest {
    public void set(User user,String age){
        user.setName(age);
    }
    @Test
    public void test01(){
        String test="{\n" +
                "    \"err_no\": 0,\n" +
                "    \"err_info\": \"操作成功\",\n" +
                "    \"data\": {\n" +
                "        \"pageNo\": 1,\n" +
                "        \"pageSize\": 10,\n" +
                "        \"total\": 0,\n" +
                "        \"pages\": 0,\n" +
                "        \"result\": [\n" +
                "            {\n" +
                "                \"crash_count\": 0.0,\n" +
                "                \"crash_model\": 0,\n" +
                "                \"start_model\": 1,\n" +
                "                \"appid\": \"com.hundsun.light.componentshow.appstore\",\n" +
                "                \"start_count\": 3.0\n" +
                "            },\n" +
                "            {\n" +
                "                \"crash_count\": 0.0,\n" +
                "                \"crash_model\": 0,\n" +
                "                \"start_model\": 2,\n" +
                "                \"appid\": \"com.hs.light112\",\n" +
                "                \"start_count\": 14.0\n" +
                "            }\n" +
                "        ],\n" +
                "        \"pageable\": true,\n" +
                "        \"appid\": null,\n" +
                "        \"appversion\": null,\n" +
                "        \"id\": null,\n" +
                "        \"maxtime\": 1611158399999,\n" +
                "        \"mintime\": 1611072000000,\n" +
                "        \"crashtime\": null,\n" +
                "        \"mappingFile\": null,\n" +
                "        \"channel\": null,\n" +
                "        \"platform\": null,\n" +
                "        \"model\": null,\n" +
                "        \"exceptiondesType\": null,\n" +
                "        \"fwversion\": null,\n" +
                "        \"crashtype\": \"NATIVE_CRASH\",\n" +
                "        \"type\": 1,\n" +
                "        \"orderColumn\": null,\n" +
                "        \"asc\": false,\n" +
                "        \"aggColumn\": null,\n" +
                "        \"queryType\": null,\n" +
                "        \"period\": 1\n" +
                "    }\n" +
                "}";
        JSONObject jsonObject = JSONObject.parseObject(test);
        JSONObject data = jsonObject.getJSONObject("data");
        JSONArray result = JSONArray.parseArray(data.getString("result"));


        Crash crash = JSONObject.parseObject(test, Crash.class);


        System.out.println(crash);


    }
    @Test
    public void test02(){
        User user = new User();
        user.setAge(1);
        new JsonTest().set(user,"ss");
        System.out.println(user);


    }

    @Test
    public void test03(){
        Integer a=1;
        Integer b=3;

        DecimalFormat df = new DecimalFormat("0.0000");

        String result = df.format((float)a.intValue()/b.intValue());
        System.out.println(Float.parseFloat(result));

    }


    @Test
    public void test04(){
        String st = "{\"data\":{\"crashtype\":\"NATIVE_CRASH\",\"pageSize\":10,\"type\":1,\"result\":[{\"crash_count\":0.0,\"crash_model\":0,\"start_model\":1,\"appid\":\"com.hundsun.light.componentshow.appstore\",\"start_count\":3.0},{\"crash_count\":0.0,\"crash_model\":0,\"start_model\":2,\"appid\":\"com.hs.light112\",\"start_count\":14.0}],\"total\":0,\"pages\":0,\"pageNo\":1,\"period\":1,\"mintime\":1611072000000,\"pageable\":true,\"maxtime\":1611158399999,\"asc\":false},\"err_info\":\"操作成功\",\"err_no\":0}\n" ;
        JSONObject jsonObject = JSONObject.parseObject(st);
        System.out.println(jsonObject);

    }





}
