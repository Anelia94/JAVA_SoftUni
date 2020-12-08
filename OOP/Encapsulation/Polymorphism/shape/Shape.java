package shape;

public abstract class Shape {
    private double perimeter;
    private double area;

    protected void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return this.perimeter;
    }

    protected abstract void calculatePerimeter();

     protected abstract void calculateArea();
}
