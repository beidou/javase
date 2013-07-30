package Q;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Administrator on 13-7-24.
 * 生成一个java.util.Date对象
 编写程序转化为”2012-6-5 14:23:22”格式的字符串
 提示：java.text.SimpleDateFormat类

 */
public class Q {
    public static void main(String[] args) {
        Date date=new Date();
        SimpleDateFormat simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd HH:MM:ss");
        System.out.println(simpleDateFormat.format(date));
    }
}
