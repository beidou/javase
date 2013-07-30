package M;

/**
 * Created by Administrator on 13-7-24.
 *
 可以求得它的表面积和体积

 在测试类中验
 double length;
 double width;
 double height;

 (length*width + width*height + height*length)*2

 length*width*height
 */

public class TestM {
    public static void main(String[] args) {
       Cuboid cuboid=new Cuboid(3,4,5);
//        cuboid.setHeight(3);
        cuboid.setHeight(6);
//        cuboid.setWidth(5);
        System.out.println(cuboid.area());
        System.out.println(cuboid.volume());
    }
}
