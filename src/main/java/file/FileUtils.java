package file;

import com.alibaba.fastjson.support.spring.annotation.ResponseJSONP;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * @author zhouzf32074
 * @Classname FileUtils
 * @Description TODO
 * @Date 2021/1/22 17:39
 */

public class FileUtils {
    /**
     * 字符串写成指定地址的文件,如果文件存在就续写
     */
    public static void stringToFile(String content,String filepath){
        FileWriter fw = null;
        try {
            //创建字符输出流对象，负责向文件内写入
            fw = new FileWriter("text.txt",true);
            //将str里面的内容读取到fw所指定的文件中
            fw.write(content+"\n");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }finally{
            if(fw!=null){
                try {
                    fw.close();
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }

    public static String readFile(String path,String filePath){
        StringBuffer buffer = new StringBuffer();
        BufferedReader bf= null;
        try {
            bf = new BufferedReader(new FileReader(path+filePath));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        String s = null;
        while(true){
            try {
                if (!((s = bf.readLine())!=null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }//使用readLine方法，一次读一行
            buffer.append(s.trim());
        }

        String xml = buffer.toString();
        System.out.println(xml);
        return xml;
    }

    public static void main(String[] args) {
        String path = FileUtils.class.getClassLoader().getResource("/text.txt").getPath();
        String s = readFile(path,"");



    }

}
