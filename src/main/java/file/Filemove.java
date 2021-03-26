//package file;
//
///**
// * @author zhouzf32074
// * @Classname Filemove
// * @Description TODO
// * @Date 2021/3/25 15:25
// */
//public class Filemove {
//    /** * 移动文件到指定的目录 *  * @author www.zuidaima.com *  */public class MoveFile { public static void main(String[] args) {  try {   File afile = new File("C:\\zuidaima_com_a\\zuidaima_com.txt");   if (afile.renameTo(new File("C:\\zuidaima_com_b\\" + afile.getName()))) {    System.out.println("File is moved successful!");   } else {    System.out.println("File is failed to move!");   }  } catch (Exception e) {   e.printStackTrace();  } }}        
//
//
//}
