package qrcode;

import com.swetake.util.Qrcode;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/**
 * @author zhouzf32074
 * @Classname QrCodeUtils
 * @Description TODO
 * @Date 2021/2/25 17:37
 */
public class QrCodeUtils {
    /**
     * @Description: 生成BufferedImage对象
     * @param content
     *            二维码存放的信息
     * @param errorCorrect
     *            容错级别
     *            表示的字符串长度： 容错率(ECC) 显示编码模式(EncodeMode)及版本(Version)有关二维码的纠错级别(排错率)，
     *            共有四级：可选L(7%)、M(15%)、Q(25%)、H(30%)(最高H)。
     *            纠错信息同样存储在二维码中，纠错级别越高，纠错信息占用的空间越多，那么能存储的有用信息就越少,
     *            对二维码清晰度的要求越小
     * @param mode
     *            编码模式 编码模式：Numeric 数字, Alphanumeric 英文字母,Binary 二进制,Kanji
     *            汉字(第一个大写字母表示)
     * @param version
     *            二维码的版本号 二维码的版本号：也象征着二维码的信息容量；二维码可以看成一个黑白方格矩阵，版本不同，
     *            矩阵长宽方向方格的总数量分别不同。 1-40总共40个版本，版本1为21*21矩阵，版本每增1，二维码的两个边长都增4；
     *            版本2 为25x25模块，最高版本为是40，是177*177的矩阵；
     * @return
     * @throws IOException
     */
    public static BufferedImage createQrcode(String content, char errorCorrect,
                                             char mode, int version) throws IOException {
        BufferedImage image =null;
        if (null == content || "".equals(content)) {

        } else {
            Qrcode qrcode = new Qrcode();
            qrcode.setQrcodeErrorCorrect(errorCorrect);
            qrcode.setQrcodeEncodeMode(mode);

            qrcode.setQrcodeVersion(version);
            // 获取内容的字节数组，设置编码格式
            byte[] bytes = content.getBytes("UTF-8");
            // 图片尺寸,会根据version的变大，而变大，自己需要计算
            int imgSize =  67 + 12 * (version - 1);
            image = new BufferedImage(imgSize, imgSize,
                    BufferedImage.TYPE_BYTE_BINARY);
            // 获取画笔
            Graphics2D gs = image.createGraphics();
            // 设置背景色 白色
            gs.setBackground(Color.WHITE);
            gs.clearRect(0, 0, imgSize, imgSize);
            // 设定图像颜色 黑色
            gs.setColor(Color.BLACK);
            // 设置偏移量，不设置可能导致二维码生产错误(解析失败出错)
            int pixoff = 2;
            // 二维码输出
            if (bytes.length > 0 && bytes.length < 120) {
                boolean[][] s = qrcode.calQrcode(bytes);
                for (int i = 0; i < s.length; i++) {
                    for (int j = 0; j < s.length; j++) {
                        if (s[j][i]) {
                            //注意j * 3 + pixoff, i * 3 + pixoff, 3, 3中的pixoff和3也会影响二维码像素，但是影响并不会很大，
                            //二维码像素主要受version影响
                            gs.fillRect(j * 3 + pixoff, i * 3 + pixoff, 3, 3);//填充矩形区域
                        }
                    }
                }
            }
            gs.dispose();
            image.flush();
        }
        return image;
    }
    /**
     * 二维码输出到文件
     *  @param image 二维码内容
     * @param format 图片格式 例如jpg、gif等
     * @param file 输出文件
     * @return
     * */
    public static File writeToFile(BufferedImage image,String format,File file) throws IOException{
        if(null == file){
            file = new File("E:"+File.separator+"xxx.xxx");//自己的默认存储路径
        }
        ImageIO.write(image, format, file);
        return file;
    }
    /**
     * @Description: 转换BufferedImage->输出流
     * @param image 二维码内容
     * @param format 图片格式 例如jpg、gif等
     * @param outPutStream 输出流
     * @return
     * @throws IOException
     */
    public static OutputStream writeToStream(BufferedImage image, String format, OutputStream outPutStream) throws IOException{
        if(null == outPutStream){
            outPutStream = new ByteArrayOutputStream();
        }
        ImageIO.write(image,format, outPutStream);
        return outPutStream;
    }

    public static void main(String[] args) throws IOException {
        BufferedImage qrcode = createQrcode("我有一个小猪宝，臭猪宝。闪闪发光大珠宝，亮晶晶。一个小猪宝，带个大珠宝，一闪一闪放光芒，放光芒。",'M' , 'C', 40);
        writeToFile(qrcode,"jpg",new File("C:\\Users\\zhouzf32074\\IdeaProjects\\MyUtils\\src\\main\\resources\\test.jpg"));
    }

}
