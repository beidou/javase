package homework;

/**
 * Created by Administrator on 13-7-25.
 */
public class getCharsTest {
    public static void main(String[] args) {
        String s="asdfghjkl";
        char []dst=new char[100];
        int dstBegin=3;
        s.getChars(2,5,dst,dstBegin);
        System.out.println("The copied Values:");
        System.out.println(dst);

    }
}
