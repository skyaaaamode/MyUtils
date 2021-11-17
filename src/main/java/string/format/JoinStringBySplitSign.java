package string.format;

import org.apache.commons.lang3.StringUtils;
import string.StringFormat;

/**
 * @author zhouzf32074
 * @Classname UpLowerChar
 * @Description 将有固定分隔符字符串合并
 * @Date 2021/10/22 14:59
 */
public class JoinStringBySplitSign implements StringFormat {
    private String splitSign;


    public JoinStringBySplitSign(String splitSign) {
        this.splitSign = splitSign;
    }

    @Override
    public String resolve(String args) {
        String target=args;
        String[] split1 = target.split(this.splitSign);
        return StringUtils.join(split1,"");
    }
}
