//import java.io.FileOutputStream;
//import java.io.OutputStream;
//
///**
// * @author zhouzf32074
// * @Classname fileType
// * @Description TODO
// * @Date 2021/4/29 11:20
// */
//public class fileType {
//
//    public boolean convertHtmlToPdf(String inputFile, String outputFile)
//            throws Exception {
//
//        OutputStream os = new FileOutputStream(outputFile);
//        ITextRenderer renderer = new ITextRenderer();
//        String url = new File(inputFile).toURI().toURL().toString();
//
//        renderer.setDocument(url);
//
//        // 解决中文支持问题
//        ITextFontResolver fontResolver = renderer.getFontResolver();
//        fontResolver.addFont("C:/Windows/Fonts/SIMSUN.TTC", BaseFont.IDENTITY_H, BaseFont.NOT_EMBEDDED);
//        //解决图片的相对路径问题
//        renderer.getSharedContext().setBaseURL("file:/D:/");
//        renderer.layout();
//        renderer.createPDF(os);
//
//        os.flush();
//        os.close();
//        return true;
//    }
//
//}
