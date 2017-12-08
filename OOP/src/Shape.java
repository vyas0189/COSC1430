public class Shape {
    double width, height;

    public Shape(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Shape() {
        width = 5;
        height=6;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
