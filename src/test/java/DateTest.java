import org.junit.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author zhouzf32074
 * @Classname DateTest
 * @Description TODO
 * @Date 2021/1/26 13:21
 */
public class DateTest {

    public static SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

    @Test
    public void testDate() throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date parse = simpleDateFormat.parse("2018-1-12");
        System.out.println(parse);
        /**
         * Date加一天，减一天
         */
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(parse);
        calendar.add(Calendar.DATE, 1);
        System.out.println(calendar.getTime());
        System.out.println(simpleDateFormat.format(calendar.getTime()));
    }
    @Test
    public void testCompare() throws ParseException {

        Date parse = simpleDateFormat.parse("2020-11-0ff");
        Date parse02 = simpleDateFormat.parse("2018-1-14");
        System.out.println(parse.compareTo(parse02));
        Date date = new Date();

    }


    @Test
    public void testCompare01() throws ParseException {

        Calendar calendar = Calendar.getInstance();
        calendar.set(calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH),0,0,0);
        calendar.set(Calendar.MILLISECOND,0);
        calendar.add(Calendar.DATE, 1);
        System.out.println(calendar.getTime().getTime());

    }


}
