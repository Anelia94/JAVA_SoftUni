package shape;

public class Circle extends Shape {
    private Double radius;

    public Circle(Double radius) {
       this.setRadius(radius);
       this.calculateArea();
       this.calculatePerimeter();
    }

    public final Double getRadius() {
        return this.radius;
    }

    public void setRadius(Double radius) {
        this.radius = radius;
    }

    @Override
    protected void calculatePerimeter() {
     this.setPerimeter(2 * Math.PI * radius);
    }

    @Override
    protected void calculateArea() {
        this.setArea(Math.PI * radius * radius);
    }
}
