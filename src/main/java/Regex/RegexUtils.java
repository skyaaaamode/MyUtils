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








    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (!scanner.hasNext("12")){
            String s = scanner.nextLine();
            System.out.println(Pattern.compile(reg05).matcher(s).matches());
        }
    }
}
