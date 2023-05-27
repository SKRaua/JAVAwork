package YuZhangproject5;

/**
 * @Author YuZhang
 * @Date 2023/5/27
 *       Version 1.0
 */
// 进行测试
public class Test {
    public static void start() {
        Circle circle1 = new Circle(4);
        System.out.println("The area of the circle is" + circle1.getArea());

        Rectangle rectangle1 = new Rectangle(3, 4);
        System.out.println("The area of the rectangle is" + rectangle1.getArea());

        Triangle triangle1 = new Triangle(3.0, 4.0, 5.0);
        System.out.println("The area of the triangle is" + triangle1.getArea());

    }
}
