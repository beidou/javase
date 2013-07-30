package homework;


import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Created by Administrator on 13-7-25.
 */
public class CompareStringTest {
    public static void main(String[] args) {
        String s=new String("China");
        String ss="china";
        String s1=new String("china");
        System.out.println("s and s1"+s==s1);
        boolean b;
//        b=s.equals(ss);
        System.out.println("The valueof s and ss:"+s.equals(ss));
//        b=ss.equals(s1);
        System.out.println("The valueof ss and s1:"+ss.equals(s1));
        System.out.println("________________________");
        System.out.println("compareTo "+s.compareTo(ss));
        System.out.println("compareTo "+ss.compareTo(s1));
        System.out.println("_________________________");
        System.out.println("equalsIgnoreCase "+s.equalsIgnoreCase(ss));
        System.out.println("-------------------------");
        System.out.println("compareToIgnoreCase "+s.compareToIgnoreCase(ss));
    }
}
