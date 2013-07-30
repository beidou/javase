package homework;

/**
 * Created by Administrator on 13-7-25.
 */
public class subStringTest {
    public static void main(String[] args) {
        String ss="欢迎收听你的月亮我的心,好男人就是我，我就是曾小贤.";
        String s=new String("啊......凡达");
        System.out.println("ss串："+ss);
        System.out.println("s串的长度："+s.length());
        System.out.println("");
        System.out.println(ss.indexOf(','));
        System.out.println(ss.substring(0, 12));
        System.out.println(ss.substring(12));
        System.out.println(s.substring(7));
        System.out.println("_______________________________________");
        System.out.println("注释：字符串从指定的 beginIndex 处开始，直到索引 endIndex - 1 处的字符");
    }
}
