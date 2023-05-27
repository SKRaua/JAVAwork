package YuZhangproject5;

/**
 * @Author YuZhang
 * @Date 2023/5/27
 * Version 1.0
 */
//Subclass Rectangle class inheritance
public class Rectangle extends Shape {
    private int weight;
    private int height;

    public Rectangle(int weight, int height) {
        this.weight = weight;
        this.height = height;
    }

    public int getweight() {
        return weight;
    }

    public int getheight() {
        return height;
    }

    //Method overwriting
    public double getArea() {
        return weight * height;
    }
}
