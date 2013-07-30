import java.io.RandomAccessFile;

/**
 * Created by Administrator on 13-7-29.
 */
public class ExceptionTest {
    public static void main(String[] args) {
        int[] arr=new int[5];

        for (int i = 0; i <arr.length ; i++) {
            arr[i]+=i;
        }
        try{
//            System.out.println(arr[arr.length]);
            System.out.println(1/0);
        }
        catch (Exception e){
//            System.out.println("数组越界！");
            e.printStackTrace();
        }
        String s1="123456";
        int x=0;
        x=Integer.parseInt(s1);
        System.out.println(x);
        try {
            RandomAccessFile randomAccessFile=new RandomAccessFile(""," ");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
