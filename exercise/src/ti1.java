/**
 * Created by Administrator on 13-7-29.
 * 题目：古典问题：有一对兔子，从出生后第3个月起每个月都生一对兔子，
 * 小兔子长到第三个月后每个月又生一对兔子，假如兔子都不死，问每个月的兔子总数为多少？
 //这是一个菲波拉契数列问题
 */
public class ti1 {
    public static  int  Feibo(int month){
        int  x=0;
        if(month){
            return 2;
        }
        else{
            return Feibo(month)
        }
    }
    public static void main(String[] args) {


    }
}
