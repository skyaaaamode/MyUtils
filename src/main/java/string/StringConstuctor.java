package string;

/**
 * @author zhouzf32074
 * @Classname StringConstuctor
 * @Description TODO
 * @Date 2021/10/22 14:55
 */
public class StringConstuctor {
    public StringConstuctor(String target) {
        this.target = target;
    }

    private  String target;

    public StringConstuctor build(StringFormat build){
        this.target=build.resolve(this.target);
        return this;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }


}
