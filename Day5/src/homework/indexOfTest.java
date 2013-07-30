package homework;

/**
 * Created by Administrator on 13-7-25.
 */
public class indexOfTest {
    public static void main(String[] args) {
        String s=new String("asdfghjklchenchen");
        String ss="chenchen";
        System.out.println("s串的长度为："+s.length());
        System.out.println("ss串的长度为："+ss.length());
        System.out.println("k的位置是："+s.indexOf('k'));
        System.out.println("h的位置是："+s.indexOf('h',2));
        System.out.println(s.indexOf(ss));
        System.out.println(s.indexOf(ss,15));

    }
}
