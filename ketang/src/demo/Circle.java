package demo;

/**
 * Created by Administrator on 13-7-24.
 */
public class Circle extends Shape {
    private double R;
    private double area;
    private double perimeter;
    public double getR() {
        return R;
    }

    public void setR(double r) {
        R = r;
    }

    @Override
    public void getArea() {
        this.area=3.14*Math.pow(getR(),2);
        System.out.println(this.area);
    }

    @Override
    public void getPerimeter() {
        this.perimeter=2*3.14*R;
        System.out.println(this.perimeter);
    }
}
