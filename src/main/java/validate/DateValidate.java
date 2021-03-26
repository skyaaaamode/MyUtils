package validate;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author zhouzf32074
 * @Classname DateValidate
 * @Description TODO
 * @Date 2021/3/9 14:16
 */
public class DateValidate {
    public static boolean test(String pattern,String date){
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        try {
            sdf.setLenient(false);//注意这一段一定要留着，否则就没有效果
            sdf.parse(date);
            System.out.println( "true" );
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(test("yyyy-MM-dd","2021-02-29"));
    }

}
