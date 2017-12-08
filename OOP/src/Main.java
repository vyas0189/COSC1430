public class Main {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();
        triangle1.setWidth(3);
        triangle1.setHeight(5);
        triangle1.getArea();

        System.out.println("----------------------");

        Triangle triangle2 =  new Triangle(5,10);
        triangle2.getArea();

        System.out.println("-----------------------");

        Rectangle rectangle1 = new Rectangle();
        rectangle1.setWidth(2);
        rectangle1.setHeight(7);
        rectangle1.getArea();

        System.out.println("------------------------");

        Rectangle rectangle2 = new Rectangle(3,6);
        rectangle2.getArea();

    }
}
