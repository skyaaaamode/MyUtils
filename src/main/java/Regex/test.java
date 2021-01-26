package Regex;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()){
//            String s = scanner.nextLine();
//            System.out.println(s.matches(RegexUtils.REGEXIP));
//        }


//        域名匹配
//        Scanner scanner = new Scanner(System.in);
//        while (scanner.hasNext()) {
//            String s = scanner.nextLine();
//            System.out.println(s.matches(RegexUtils.REGXDOMAIN));
//        }
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String s = scanner.nextLine();
            System.out.println(s.matches(RegexUtils.REGENUM));
        }


    }


}
