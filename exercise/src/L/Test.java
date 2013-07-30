package L;

/**
 * Created by Administrator on 13-7-24.
 * 设计一个形状父类Shape，定义求面积Area和周长Perimeter的方法
 设计Shape的子类：
 Circle
 Square
 Rectangle
 Triangle a b c
 以上类中自定义域，并实现Shape中的方法

 创建Test类，生成以上实现类的实例，并求其面积和周长
 */
class Shape{
   public double area;
   public double perimeter;
   public void Area(){
       System.out.println("面积——————");
   }
    public void Perimeter(){
        System.out.println("周长———————");
    }
}
class  Circle extends Shape{
    private double r;

    void setR(double r) {
        this.r = r;
    }

    double getR() {
        return r;
    }

    @Override
    public void Area() {
        super.Area();
        super.area=3.14*Math.pow(r,2);
        System.out.println(super.area);
    }

    @Override
    public void Perimeter() {
        super.Perimeter();
        super.perimeter=2*3.14*r;
        System.out.println(super.perimeter);
    }
}
class  Square extends Shape{
    private double a;

    double getA() {
        return a;
    }

    void setA(double a) {
        this.a = a;
    }

    @Override
    public void Area() {
         super.Area();
         super.area=Math.pow(a,2);
        System.out.println(super.area);
    }

    @Override
    public void Perimeter() {
       super.Perimeter();
        super.area= 4*a;
        System.out.println(super.perimeter);
    }
}
class  Rectangle extends Shape{
    private double x;
    private double y;

    double getX() {
        return x;
    }

    void setX(double x) {
        this.x = x;
    }

    double getY() {
        return y;
    }

    void setY(double y) {
        this.y = y;
    }

    @Override
    public void Area() {
       super.Area();
        super.area= x*y;
        System.out.println(super.area);
    }

    @Override
    public void Perimeter() {
        super.Perimeter();
        super.perimeter=2*x+2*y;
    }
}
class  Triangle extends Shape{
    private double b;
    private double c;
    private double p;

    double getB() {
        return b;
    }

    void setB(double b) {
        this.b = b;
    }

    double getC() {
        return c;
    }

    void setC(double c) {
        this.c = c;
    }

    double getP() {
        return p;
    }

    void setP(double p) {
        this.p = p;
    }

    @Override
    public void Area() {
        super.Area();
        super.area=0.5* Math.min(b,c)*Math.min(c,p);
        System.out.println(super.area);
    }

    @Override
    public void Perimeter() {
       super.Perimeter();
        super.perimeter= b+c+p;
        System.out.println(super.perimeter);
    }
}
public class Test {
    public static void main(String[] args) {
       Circle circle=new Circle();
       circle.setR(5);
       circle.Area();
       circle.Perimeter();
    }
}
