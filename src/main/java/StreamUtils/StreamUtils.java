package StreamUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class TAdslot{
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
public class StreamUtils {
    public static void main(String[] args) {
        /**
         * 提取list对象中的某个属性，形成新的list
         */
        List<TAdslot> userList = new ArrayList<>();
        TAdslot adslot1 = new TAdslot();
        adslot1.setName("One");
        adslot1.setAge(10);
        TAdslot adslot2 = new TAdslot();
        adslot2.setName("Zero");
        adslot2.setAge(11);
        TAdslot adslot3 = new TAdslot();
        adslot3.setName("Two");
        adslot3.setAge(12);
        TAdslot adslot4 = new TAdslot();
        adslot4.setName("Four");
        adslot4.setAge(13);
        userList.add(adslot1);
        userList.add(adslot2);
        userList.add(adslot3);
        userList.add(adslot4);

        List<Integer> stringList = userList.stream().map(TAdslot::getAge).collect(Collectors.toList());

        System.out.println(stringList);

    }
}
