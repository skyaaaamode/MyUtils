import org.graalvm.compiler.replacements.IntrinsicGraphBuilder;

/**
 * @author zhouzf32074
 * @Classname Test
 * @Description TODO
 * @Date 2021/2/3 10:30
 */
public class Test {
    @org.junit.Test
    public void test01(){
        Integer x=null;
        if(x==null)
            x=1;
        else
            x=2;
        System.out.println(x);
    }



}
