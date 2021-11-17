package Regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexUtils {
    public static final String REGEXIP="(2[5][0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})\\.(25[0-5]|2[0-4]\\d|1\\d{2}|\\d{1,2})";
    public static final String REGXDOMAIN="^([a-zA-Z0-9]([a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])?\\.)+[a-zA-Z]{2,6}$";
    public static final String REGENUM="^[0-9]+$";

    /**
     * 1-10位数字或字母
     * @param args
     */
    public static final String reg01="^[0-9a-zA-Z]{1,10}$";


    /**
     * 1-10位中英文或数字
     * @param args
     */
    public static final String reg02="^[0-9a-zA-Z\u4e00-\u9fa5]{1,10}$";

    /**
     * 1-10任意字符
     * @param args
     */
    public static final String reg03="^[\\s\\S]{1,20}$";


    public static final String reg04="^0+(\\.0+){0,3}$";


    /**
     * 日期格式
     */
    public static final String reg05="^\\d{4}(\\-\\d{1,2}){2}$";


    /**
     * 以https开头的字符串
     * @param args
     */
    public static final String https="^https[\\s\\S]*$";

    /**
     * git格式地址
     * @param args
     */
    public static final String git="^(((git@||ssh://git@)?[a-zA-Z0-9]{1,100}.[a-zA-Z0-9]{1,100}.[a-zA-Z0-9]{0,100}:[a-zA-Z0-9][a-zA-Z0-9-_]{0,19}(/[0-9a-zA-Z_!~*().&=+$%-]{1,100}){1,10}.git))";


    /**
     * 用逗号分隔字符串
     */
    public static final String set="^[A-Za-z]+(,[A-Za-z]+)*$";


    /**
     * 用逗号分隔数值字符串
     */
    public static final String setNum="^\\d+(,\\d+)*$";


    public static final String model="\\$\\{[\\s\\S]*\\}";

    public static final String percent="^\\d*(\\.\\d+)?%$";

//    邮箱的正则表达式

    public static final String mail="^[0-9a-zA-Z\\.\\_\\-]{1,}@[0-9a-zA-Z]{1,}\\.[0-9a-zA-Z]{1,}$";



    // 手机号的正则表达式


    public static final String phone="^[0-9a-zA-Z\\.\\_\\-]{1,}@[0-9a-zA-Z]{1,}\\.[0-9a-zA-Z]{1,}$";





    public static final String filetype="^@filename=([A_Za-z]+)$";








    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("12")){
            String s = scanner.nextLine();
            System.out.println(Pattern.compile(filetype).matcher(s).matches());


        }

    }
}
