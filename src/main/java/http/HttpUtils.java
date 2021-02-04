package http;

import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouzf32074
 * @Classname HttpUtils
 * @Description TODO
 * @Date 2021/2/1 13:41
 */
public class HttpUtils {
    private static String doGet(String url,Map<String,String> params,Map<String,String> header){

        String getUrl = map2url(params, url);

        String s = null;
        try {
            s = HttpClient4.doGet(getUrl, header);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return s;
    }


    public static String map2url(Map<String,String> mapParamter,String url){
        StringBuffer stringBuffer = new StringBuffer();
        if(mapParamter==null||mapParamter.size()==0||url==null||url.length()==0){
            return "";
        }
        for (Map.Entry<String,String> item:mapParamter.entrySet()){
            String key = item.getKey();
            String value = item.getValue();
            stringBuffer.append(key+"="+value+"&");
        }
        stringBuffer.deleteCharAt(stringBuffer.length()-1);
        String s = stringBuffer.toString();
        return url+"?"+s;
    }

    public static void main(String[] args) {
        String getUr="http://pas-api.qinglight.com/ltpas/operation/v/operation/h5manage/search_comp";
        HashMap<String, String> header = new HashMap<String,String>(){
            {
                put("cookie","token=b6ecdfd6-156b-48ad-9d4a-14ef33bac6ae2");
            }
        };
        HashMap<String, String> params = new HashMap<String,String>(){
            {put("name","wu_mai");}
        };

        String s = doGet(getUr,params,header);
        System.out.println(s);
    }









}
