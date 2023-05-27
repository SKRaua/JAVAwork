package YuZhangproject5;

/**
 * @Author YuZhang
 * @Date 2023/5/27
 * Version 1.0
 */
//Subclass Rectangle class inheritance
public class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle(){
        super();
        this.width = 1.0;
        this.length = 2.0;
    }
    public Rectangle(String name,double width, double length) {
        this.width = width;
        this.length = length;
    }
    public double getWidth() {
        return width;
    }
    public void setWidth(double width){
        this.width = width;
    }
    public double getLength() {
        return length;
    }
    public void setLength(double length){
        this.length = length;
    }
    //Method overwriting
    public double getArea() {
        return width * length;
    }
    public boolean equals(Object obj) {
        final double TOLERANCE = 0.0001;
        if (!(obj instanceof Rectangle)) {
            return false;
        }
        Rectangle other = (Rectangle) obj;
        return (super.equals(obj)
                && Math.abs(this.width - other.width) < TOLERANCE
                && Math.abs(this.length - other.length) < TOLERANCE
                && super.equals(other)==super.equals(obj));
    }

    public String toString() {
        return getClass().getName() + ":" + this.width+
        getClass().getName() + ":" + this.length;
    }
}

