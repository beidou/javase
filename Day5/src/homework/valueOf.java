package homework;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Objects;

/**
 * Created by Administrator on 13-7-25.
 */
public class valueOf {
    public static void main(String[] args) {
//        String ss="欢迎收听你的月亮我的心,好男人就是我，我就是曾小贤.";
        String s=new String("啊......凡达");
        char z='曾';
        char x='小';
        char xian='贤';
        char[] zxx={'曾','小','贤'};
        boolean b=false;
        double pi=3.000000;
        Object[] objects=new Object[3];
        objects[0]="欢迎收听你的月亮我的心,";
        objects[1]="好男人就是我,我就是";
        objects[2]="曾小贤";
        System.out.println(String.valueOf(z));
        System.out.println(s);
        System.out.println(String.valueOf(zxx));
        System.out.println(String.valueOf(b));
        System.out.println(pi);
        System.out.println(String.valueOf(pi));
        System.out.println(String.valueOf(objects));


    }
}
