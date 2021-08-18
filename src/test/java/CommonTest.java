import org.junit.Test;

import java.util.Arrays;

/**
 * @author zhouzf32074
 * @Classname CommonTest
 * @Description TODO
 * @Date 2021/5/24 11:32
 */
public class CommonTest {



    @Test
    public void test01(){
        String[] strings = {"ww", "ss", "gg"};
        String[] strings02 = {"好", "差", "极差"};
        int s01 = Arrays.binarySearch(strings, "ww");
        int s02 = Arrays.binarySearch(strings02, "好");
        System.out.println(s01+s02);

    }
    public static String packaged(String...value){
        return String.format("sds_%s_%s",value);

    }

    public static void main(String[] args) {
        String packaged = packaged("sds", "sdsd");
        System.out.println(packaged);
    }


}
