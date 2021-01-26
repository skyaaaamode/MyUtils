import Regex.RegexUtils;
import org.junit.Test;
import popj.User;

import java.util.Scanner;

public class REGEXtest {
    @Test
    public void testDomain(){
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            String s = scanner.nextLine();
            System.out.println(s.matches(RegexUtils.REGXDOMAIN));
        }
    }

    @Test
    public void test(){
        User user = new User();
        user.setCount(-1L);
        if(null!=user.getCount()||user.getCount()<0){
            System.out.println("haha");
        }
        System.out.println(user);

    }

}

