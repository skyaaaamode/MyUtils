package encryption;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Date;
import java.util.HashSet;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @author zhouzf32074
 * @Classname Md5Util
 * @Description TODO
 * @Date 2021/11/16 13:58
 */
public class Md5Util {



    public static String genMd5(String loginName){

        MessageDigest md5 ;
        try {
             md5 = MessageDigest.getInstance("MD5");
            md5.update(loginName.getBytes());
            String substring = new BigInteger(1, md5.digest()).toString(16).substring(8, 24);
            return substring;
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }


    }



    public static void main(String[] args) {
        Timer timer = new Timer();
        HashSet<String> strings = new HashSet<>();
        timer.schedule(new TimerTask() {
            int run=0;
            @Override
            public void run() {
                long time = System.currentTimeMillis();
                String login ="375874825@qq.com"+ time;
                String s = genMd5(login);
                System.out.println("=====================");
                System.out.println("第"+run+"轮");
                System.out.println("login为:"+login);
                System.out.println("s为:"+s);
                if(strings.contains(s)||run==100000){
                    System.out.println("最终轮次为:"+run);
                    System.gc();
                    cancel();
                }else {
                    strings.add(s);
                }
                run++;
            }},1,20);





    }




}
