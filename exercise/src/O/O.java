package O;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.lang.String;
/**
 * Created by Administrator on 13-7-24.
 * 在ArrayList的一个实例中保存十二个月份：
 January February March April May June July August September October November December
 用户输入他的姓名后，根据他姓名的字符个数n返回arraylist中的第n个月份元素值

 */
class O {
    public static void main(String[] args) {
        ArrayList <String>arrayList=new ArrayList <String>();
        String str="January,February,March,April,May,June,July,August,September,October,November,December";
        String ss[]=new String[12];
        ss = str.split(",") ;
        arrayList = new ArrayList<String>(Arrays.asList(ss));// 字符数组转list
        Scanner scanner=new Scanner(System.in);
        System.out.println("请输入你的姓名：");
        String string= scanner.nextLine().trim();
        int index=string.length();
        System.out.println(arrayList.get(index - 1));
    }
}
