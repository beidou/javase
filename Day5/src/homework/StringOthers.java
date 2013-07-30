package homework;

/**
 * Created by Administrator on 13-7-25.
 */
public class StringOthers {
    public static void main(String[] args) {
        String ss="女博士就是我，我就是陈美嘉.";
        char cc='胡';
        char c1='一';
        char c2='菲';
        String s1="bbs";
        String s=new String("胡一菲");
        System.out.println(ss.replace('陈','胡'));
        System.out.println(ss.replace('美','一'));
        System.out.println(ss.replace('嘉','菲'));
        System.out.println(ss.replace("陈美嘉",s));
        System.out.println(ss.replace(ss,s));
//        System.out.println(ss);
        System.out.println(s1.toUpperCase());
        System.out.println(s1);
    }
}
