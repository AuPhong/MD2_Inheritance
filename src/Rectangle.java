public class Rectangle extends Shape implements Resizeable{
    double width = 1;
    double length = 1;

    public Rectangle() {
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }

    @Override
    public double resize(double percent) {
          return this.getArea()+this.getArea()*percent/100;
    }

    public Rectangle(String color, boolean filled, double width, double length) {
        super(color, filled);
        this.width = width;
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getArea(){
        return this.width * this.length;
    }

    public double getPerimeter(){
        return (this.width+this.length)*2;
    }

    @Override
    public String toString() {
        return "A Rectangle with width = "+getWidth()+" ,length = "+getLength()+" ,area = "+getArea()+" ,perimeter is "+getPerimeter()+" ,which is a subclass of "+super.toString();
    }
}
