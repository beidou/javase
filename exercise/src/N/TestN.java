package N;

import java.util.Scanner;

/**
 * 用户输入一组double直接量,求这一组数的平均数
 * Created by Administrator on 13-7-24.
 */
public class TestN {
    public static void main(String[] args) {

        boolean b=true;
        double sum=0;
        int x=0,counter=0;
        Scanner scanner=new Scanner(System.in);
        System.out.println("输入数的的个数：");
        x=scanner.nextInt();
        double []p=new double[x];
        System.out.println("请输入一组数");
        while(b){
            for(int i=0;i<x;i++){
                p[i]=scanner.nextDouble();
                counter++;
            }
            if(counter==x)
                break;
        }
        for (int i = 0; i <counter ; i++) {
            sum+=p[i];
        }
        System.out.println("该组数据的平均数为："+sum/counter);
    }
}
