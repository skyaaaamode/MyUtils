package file;

import com.alibaba.fastjson.support.spring.annotation.ResponseJSONP;

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
     * 字符串写成指定地址的文件
     */
    public static void stringToFile(String filepath){
        String str = "白天走在街道上，伸手不见五指，周围的建筑全被雾笼罩了，在家里通过窗户往外望去，外面就像仙境一般，雾把所有的东西都淹没了，能看到的，只有白色的雾。！";
        FileWriter fw = null;
        try {
            //创建字符输出流对象，负责向文件内写入
            fw = new FileWriter("text.txt");
            //将str里面的内容读取到fw所指定的文件中
            fw.write(str);
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

    public static void main(String[] args) {
        System.out.println(FileUtils.class.getClassLoader().getResource("").getPath());
    }

}
