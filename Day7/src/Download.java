import java.io.*;
import java.net.URL;

/**
 * Created by Administrator on 13-7-29.
 */
public class Download {
    public String getContent(String strUrl)
    // 一个public方法，返回字符串，错误则返回"error open url"
    {
        try {

            URL url = new URL(strUrl);
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String s = "";
            StringBuffer sb = new StringBuffer("");
            while ((s = br.readLine()) != null) {
                sb.append(s + "\r\n");
            }
            br.close();
            return sb.toString();
        } catch (Exception e) {
            return "error open url" + strUrl;

        }
    }

    public static void main(String args[]) {
        //具体使用方法
        Download ou = new Download();
        System.out.println(ou.getContent("http://tuan.jd.com/beijing-0-0-0-0-0-0-1-0-0.html"));
    }

}


