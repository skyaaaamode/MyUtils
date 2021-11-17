package string.format;

import string.StringFormat;

/**
 * @author zhouzf32074
 * @Classname UpLowerChar
 * @Description 字符串大小写转换
 * @Date 2021/10/22 14:59
 */
public class UpLowerCharMethods implements StringFormat {

    private static String LOWER="all_low";


    //将全部的大写字母转换成小写字母
    public String lowerChar(String target){
        return target.toLowerCase();
    }


    @Override
    public String resolve(String args) {
        String target=args;
        return lowerChar(target);
    }
}
