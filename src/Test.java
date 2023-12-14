import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test Class Shape
        Shape shape = new Shape();
        shape.setColor("blue");
        System.out.println(shape.getColor());
        System.out.println("------");
        Triangle triangle = new Triangle();
        triangle.setSide1(10);
        System.out.println("input side1");
        triangle.setSide1(scanner.nextDouble());
        System.out.println("input side2");
        triangle.setSide2(scanner.nextDouble());
        System.out.println("input side3");
        triangle.setSide2(scanner.nextDouble());
        System.out.println("input height");
        triangle.setHeight(scanner.nextDouble());
        scanner.nextLine();
        System.out.println("input color");
        triangle.setColor(scanner.nextLine());
        System.out.println(triangle.toString());

        System.out.println("color: " + triangle.getColor() + ", p = " + triangle.getPerimeter() + " , S = " + triangle.getArea());


    }
}