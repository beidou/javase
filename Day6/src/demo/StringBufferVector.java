package demo;

import java.util.Vector;

/**
 * Created by Administrator on 13-7-26.
 */
public class StringBufferVector {
    public static void main(String[] args) {
        StringBuffer stringBuffer=new StringBuffer();
        for (int i = 0; i <'a'; i++) {
            stringBuffer.append("bbc");
//            System.out.println(stringBuffer);
        }
        Vector<Integer> vector=new Vector<>();
        vector.add(3);
        System.out.println(vector.get(0));
//        Iterator<Integer> s=new Iterator<>() {

    }
}
