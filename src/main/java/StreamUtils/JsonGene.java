//package StreamUtils;
//
//import com.alibaba.fastjson.JSON;
//
//import javax.swing.*;
//import java.util.ArrayList;
//
///**
// * 文件描述
// *
// * @ProductName: Hundsun HEP
// * @ProjectName: MyUtils
// * @Package: StreamUtils
// * @Description: note
// * @Author: zhouzf32074
// * @CreateDate: 2020/12/28 22:48
// * @UpdateUser: zhouzf32074
// * @UpdateDate: 2020/12/28 22:48
// * @UpdateRemark: The modified content
// * @Version: 1.0
// * Copyright © 2020 Hundsun Technologies Inc. All Rights Reserved
// **/
//class JsonClass{
//    public String getGroup_name() {
//        return group_name;
//    }
//
//    public void setGroup_name(String group_name) {
//        this.group_name = group_name;
//    }
//
//    public Integer getWhite_type() {
//        return white_type;
//    }
//
//    public void setWhite_type(Integer white_type) {
//        this.white_type = white_type;
//    }
//
//    public String getUser_id() {
//        return user_id;
//    }
//
//    public void setUser_id(String user_id) {
//        this.user_id = user_id;
//    }
//
//    public String getUser_desc() {
//        return user_desc;
//    }
//
//    public void setUser_desc(String user_desc) {
//        this.user_desc = user_desc;
//    }
//
//    private String group_name;
//    private Integer white_type;
//    private String user_id;
//    private String user_desc;
//
//}
//public class JsonGene {
//    public static void main(String[] args) {
//        ArrayList<JsonClass> jsonClasses = new ArrayList<JsonClass>();
//        for (int i=0;i<1001;i++){
//            JsonClass jsonClass = new JsonClass();
//            jsonClass.setGroup_name("ssss");
//            jsonClass.setUser_id("light"+i);
//            jsonClass.setWhite_type(1);
//            jsonClasses.add(jsonClass);
//        }
//        System.out.println(JSON.toJSONString(jsonClasses));
//
//    }
//
//}
