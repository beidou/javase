package homework;

import java.util.Scanner;

/**
 * Created by Administrator on 13-7-26.
 */
public class charToString {
    public static void main(String[] args) {
        String s=null;
        String s1=null;
        char[] ch={'h','a','p','p','y',' ','n','e','w',' ','y','e','a','r'};
        for (int i = 0; i <ch.length ; i++) {
            s1=String.valueOf(ch,0,ch.length);
        }
        System.out.println(s1);
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入小写字母：");
        char[] c=scanner.nextLine().trim().toCharArray();
        for (int i = 0; i <c.length; i++) {
            if(c[i]<'z'&&c[i]>='a'){
                System.out.print((char)(c[i]-32));
            }
        }
    }
}