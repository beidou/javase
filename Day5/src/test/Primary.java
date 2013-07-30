package test;

/**
 * Created by Administrator on 13-7-25.
 */
public class Primary {
    private static int i;
//    private  int i;
    public static void method(Primary primary){
        System.out.println(i);
//        System.out.println(primary.i);
        primary.i++;
        System.out.println("method:i="+i);
    }
    public static void method1(int i){
        System.out.println(i);
        i++;
        System.out.println("method1:i="+i);
    }
    public static void main(String[] args) {
//        int i=0;
//        Primary primary=new Primary();
//        method(primary);
//        System.out.println("primary:"+primary.i);
        method1(i);
        System.out.println(i);
    }
}
