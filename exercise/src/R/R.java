package R;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Administrator on 13-7-24.
 * 要求：只能使用以下3种输出语句：
 System.out.print(" ");
 System.out.print("*");
 System.out.println("*");

 n(奇数)行的同样的图形？

 */
public class R {
    public static void main(String[] args) {
        for (int i = 1; i <=4 ; i++) {
            for (int j =0; j<4-i ; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <=2*i-1 ; j++) {
                System.out.print("*");
            }

            System.out.println(" ");
        }
        for (int i = 5; i <8 ; i++) {
            for (int j = 8; j <4-(i-4) ; j--) {
                System.out.println("*");
            }
//            for (int j = ; j < ; j++) {
//
//            }
        }
    }
}
