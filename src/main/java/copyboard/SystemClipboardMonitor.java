package copyboard;

/**
 * @author zhouzf32074
 * @Classname SystemClipboardMonitor
 * @Description TODO
 * @Date 2021/2/18 15:51
 */
import org.w3c.dom.Text;

import javax.swing.*;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.ClipboardOwner;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 * 剪贴板监控器
 * 负责对剪贴板文本的监控和操作
 * 由于监控需要一个对象作为ClipboardOwner，故不能用静态类
 *
 */
public class SystemClipboardMonitor implements ClipboardOwner{
    private Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();

    public SystemClipboardMonitor(){
        //如果剪贴板中有文本，则将它的ClipboardOwner设为自己
        if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor)){
            clipboard.setContents(clipboard.getContents(null), this);
        }
    }

    /************
     * 测试代码 *
     * **********
     */
    public static void main(String[] args) {
        SystemClipboardMonitor temp = new SystemClipboardMonitor();
        new JFrame().setVisible(true); // 软件窗口
    }

    /**********************************************
     * 如果剪贴板的内容改变，则系统自动调用此方法 *
     **********************************************
     */
    @Override
    public void lostOwnership(Clipboard clipboard, Transferable contents) {
        // 如果不暂停一下，经常会抛出IllegalStateException
        // 猜测是操作系统正在使用系统剪切板，故暂时无法访问
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        // 取出文本并进行一次文本处理
        String text = null;
        if (clipboard.isDataFlavorAvailable(DataFlavor.stringFlavor)){
            try {
                text = (String)clipboard.getData(DataFlavor.stringFlavor);
            } catch (UnsupportedFlavorException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        String clearedText =text ;// 自定义的处理方法
        resolve(text);
        // 存入剪贴板，并注册自己为所有者
        // 用以监控下一次剪贴板内容变化
        StringSelection tmp = new StringSelection(clearedText);
        clipboard.setContents(tmp, this);
    }
    public void resolve(String clipBoard){
        System.out.println(clipBoard);
    }

}
