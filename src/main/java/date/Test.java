package date;

import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhouzf32074
 * @Classname Test
 * @Description TODO
 * @Date 2021/1/5 19:14
 */

public class Test {



    public static void main(String[] args) throws ParseException {
        // Date date= new Date(System.currentTimeMillis());
        // String pattern="yyyy/MM/dd HH时mm分ss秒";
        // SimpleDateFormat sdf= new SimpleDateFormat(pattern);
        // String datestr=sdf.format(date);// format  为格式化方法
        // System.out.println(datestr);
        // System.out.println(new Timestamp(new Date(System.currentTimeMillis()).getTime()));


        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        for (int i=0;i<10;i++){
            long time = sdf.parse("2018-08-09 00:00:00.0").getTime();
            System.out.println(time);
        }




    }


}
