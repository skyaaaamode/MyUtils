//package time;
//
//import java.math.BigDecimal;
//import java.text.DecimalFormat;
//import java.util.Scanner;
//import java.util.regex.Pattern;
//
///**
// * @author zhouzf32074
// * @Classname Trans
// * @Description TODO
// * @Date 2021/1/15 13:17
// */
//public class Trans {
//
//    /**
//     * 小数的小时
//     * @param time
//     * @return
//     */
//    public static String trans(String time){
//
//        Integer h = (int)Math.floor(time);
//        Integer min=(int)Math.ceil((time-h)*60);
//        String regx="";
//        if(h>0){
//             regx="%d小时%d分";
//            return String.format(regx,h,min);
//        }else {
//            regx="%d分";
//            return  String.format(regx,min);
//        }
//    }
//
//
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (!scanner.hasNext("0")){
//            String s = scanner.nextLine();
//
//        }
//    }
//}
