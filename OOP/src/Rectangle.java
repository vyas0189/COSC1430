public class Rectangle extends Shape implements Area {
    //double width, height;

    public Rectangle(double width, double height) {
        super(width,height);
    }
    public Rectangle(){
        super();
    }
    @Override
    public void getArea() {
        double area = width*height;
        System.out.println("The area of the rectangle is: " + area);
    }
}
