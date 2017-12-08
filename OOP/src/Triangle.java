public class Triangle extends Shape implements Area {

    //double width,height;

    public Triangle(double width, double height) {
        super(width, height);
    }

    public Triangle() {
        super();
    }

    @Override
    public void getArea() {
        double area = (width*height)/2;
        System.out.println("The area of the triangle is: " + area);
    }
}
