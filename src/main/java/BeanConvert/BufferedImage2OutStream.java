package BeanConvert;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author zhouzf32074
 * @Classname BufferedImage2OutStream
 * @Description TODO
 * @Date 2021/3/1 13:40
 */
public class BufferedImage2OutStream implements BeanCovert<BufferedImage,OutputStream> {


    @Override
    public BufferedImage convertT(OutputStream object,String format) {
        return null;
    }

    /**
     * format ：gif,png,jpg
     * @param object
     * @param format
     * @return
     */
    @Override
    public OutputStream convertU(BufferedImage object,String format) {
        OutputStream result=null;
        if(null == object){
            result = new ByteArrayOutputStream();
        }
        try {
            ImageIO.write(object,format, result);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }
}
