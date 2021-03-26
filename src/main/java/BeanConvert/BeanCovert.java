package BeanConvert;

/**
 * @author zhouzf32074
 * @Classname BeanCovert
 * @Description TODO
 * @Date 2021/3/1 13:41
 */
public interface BeanCovert<T,U> {
    T convertT(U object,String format);

    U convertU(T object,String format);


}
