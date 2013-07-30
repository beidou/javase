package P;

import java.util.Random;
import java.util.Scanner;

/**
 * Created by Administrator on 13-7-24.
 * 编写程序，生成一个由随机整数构成的数组，数组元素为10
 随机数的范围为[1,n]，n为用户输入的一个正整数
 */
public class P {
    public static void main(String[] args) {
        int []p=new int [10];
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入随机数的上限：");
        int n=scanner.nextInt();
        Random random=new Random();
        for (int i = 0; i <10 ; i++) {
            p[i]=1+random.nextInt(n);
            System.out.print(p[i]+"  ");
        }
    }
}
