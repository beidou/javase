package demo1;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Administrator on 13-7-24.
 */
public class FinalTest {
    private final int x;

    public FinalTest(int x) {
        this.x = x;
    }

    public static void main(String[] args) {
        FinalTest finalTest=new FinalTest(5);
        System.out.println(finalTest.x);
    }
}
