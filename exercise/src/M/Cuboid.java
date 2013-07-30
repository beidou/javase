package M;

/**
 * Created by Administrator on 13-7-24.
 */
class Cuboid{
    private double length;
    private double width;
    private double height;

    Cuboid(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double area(){
        return (length*width + width*height + height*length)*2;
    }
    public  double volume(){
        return length*width*height;
    }

    double getLength() {
        return length;
    }

    void setLength(double length) {
        this.length = length;
    }

    double getWidth() {
        return width;
    }

    void setWidth(double width) {
        this.width = width;
    }

    double getHeight() {
        return height;
    }

    void setHeight(double height) {
        this.height = height;
    }
}