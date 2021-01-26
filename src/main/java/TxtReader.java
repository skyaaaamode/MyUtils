import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.sql.Statement;
import java.util.HashMap;
import java.util.Map;

/**
 * 文件描述
 *
 * @ProductName: Hundsun HEP
 * @ProjectName: MyUtils
 * @Package: PACKAGE_NAME
 * @Description: note
 * @Author: zhouzf32074
 * @CreateDate: 2020/12/16 16:39
 * @UpdateUser: zhouzf32074
 * @UpdateDate: 2020/12/16 16:39
 * @UpdateRemark: The modified content
 * @Version: 1.0
 * Copyright © 2020 Hundsun Technologies Inc. All Rights Reserved
 **/
public class TxtReader {
    /**
     * 功能：Java读取txt文件的内容
     * 步骤：1：先获得文件句柄
     * 2：获得文件句柄当做是输入一个字节码流，需要对这个输入流进行读取
     * 3：读取到输入流后，需要读取生成字节流
     * 4：一行一行的输出。readline()。
     * 备注：需要考虑的是异常情况
     * @param filePath
     *
     *
     *
     * 实现功能
     */

    public static String[] attributes=new String[]{
      "int","Integer","String","Number","Long"
    };
    public static HashMap<String,String> Annotationrules=new HashMap<>(){{
        put("String:allow","NotNull");
        put("String:required","NotBlank");
        put("required","NotNull");

    }};

    public static void readTxtFile(String filePath,String groups){
        try {
            String encoding="GBK";
            File file=new File(filePath);
            if(file.isFile() && file.exists()){ //判断文件是否存在
                InputStreamReader read = new InputStreamReader(
                        new FileInputStream(file),encoding);//考虑到编码格式
                BufferedReader bufferedReader = new BufferedReader(read);
                String lineTxt = null;
                groupsGene(groups);
                while((lineTxt = bufferedReader.readLine()) != null){
                    translate(lineTxt,groups);
                }
                read.close();
            }else{
                System.out.println("找不到指定的文件");
            }
        } catch (Exception e) {
            System.out.println("读取文件内容出错");
            e.printStackTrace();
        }

    }


//    将node脚本翻译成java的实体类
    public static  String translate(String node,String classname){
        //1.分类实体类属性名
        String[] split = node.split(":");
        String fieldName=split[0];
        //2.判断属性值，判断数据校验规则
        String s=split[1];
        String val = addAnnotations(s);
        String validate = validate(val, fieldName, classname);
        System.out.println(validate);
        String attr = addAttribute(s);
        String defination="private "+attr+" "+fieldName+";";
        System.out.println(defination);
        return validate+"\n"+defination;
    }
    public static String validate(String name,String message,String groups){
        if(groups!=null&&groups.length()>0){
            return "@"+name+"(message=\""+message+"不能为空\",groups={"+groups+"})";
        }
        return "@"+name+"(message=\""+message+"不能为空\")";
    }

    public static String addAnnotations(String s){
        for (Map.Entry<String,String> item:Annotationrules.entrySet()){

            String[] split = item.getKey().split(":");
            if(split.length>0){
                boolean flag=true;
                for(String i:split){
                    if(s.indexOf(i.toLowerCase())==-1){
                        flag=false;
                    }
                }
                if(flag){
                    return item.getValue();
                }

            }else {
                if(s.indexOf(item.getKey().toLowerCase())!=-1){
                    return item.getValue();
                }
            }


        }
        return null;

    }
    public static String addAttribute(String s){
        for (String item:attributes){
            if(s.toLowerCase().indexOf(item.toLowerCase())!=-1){
                return item;
            }

        }
        return null;
    }
    public static String groupsGene(String s){
        String[] split = s.split(",");
        String result="";
        if(split.length>0){
            for (String item:split){
                int i = item.indexOf(".");
                String substring = item.substring(0, i);
                System.out.println("public static interface "+substring+"{};");
                result+="public static interface "+substring+"{};"+"\n";
            }
            return result;
        }else {
            String[] split2 = s.split(".");
            System.out.println("public static interface "+split2[0]+"{};");
            return "public static interface "+split2[0]+"{};";
        }

    }




    public static void main(String argv[]){
        String filePath = "E:\\test\\test.txt";
        readTxtFile(filePath,"Create.class");
    }
}
