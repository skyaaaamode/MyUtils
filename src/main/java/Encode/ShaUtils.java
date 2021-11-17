package Encode;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.UUID;

/**
 * @author zhouzf32074
 * @Classname ShaUtils
 * @Description TODO
 * @Date 2021/11/5 10:44
 */
public class ShaUtils {

    public static final String KEY_SHA = "SHA-256";



    public static void main(String[] args) {

        UUID token= UUID.randomUUID();
        String inputStr = "123456";
        BigInteger sha = null;
        System.out.println("=======加密前的数据:" + inputStr);
        byte[] inputData = inputStr.getBytes();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(KEY_SHA);
            messageDigest.update(inputData);
            sha = new BigInteger(messageDigest.digest());
            System.out.println("SHA加密后:" + sha.toString(6));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
