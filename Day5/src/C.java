/**
 * Created by Administrator on 13-7-25.
 */
public class C implements A,B {
    @Override
    public void a1() {
        System.out.println("我是a1");
    }

    @Override
    public void a2() {
        System.out.println("我是a2");
    }

    @Override
    public int add(int x, int y) {
        int z=x+y;
        return z;
    }

    public static void main(String[] args) {
        A a=new C();
        a.a1();
        a.a2();
        C c=new C();
        System.out.println(c.add(1,1));
    }
}
