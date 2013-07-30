package homework;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Administrator on 13-7-25.
 */
public class lastIndexOfTest {
    public static void main(String[] args) {
        String s=new String("asdfghjklasdfgchenchen");
        String ss="chenchen";
        System.out.println("s串的长度为："+s.length());
        System.out.println("ss串的长度为："+ss.length());
        System.out.println(s.lastIndexOf('e'));
        System.out.println("从19位置开始ss中c出现的索引："+s.lastIndexOf('c',19));
        System.out.println(s.lastIndexOf(ss,21));
        System.out.println(s.lastIndexOf(ss));
    }
}
