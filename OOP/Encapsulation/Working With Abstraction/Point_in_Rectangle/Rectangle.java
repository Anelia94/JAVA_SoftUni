package Point_in_Rectangle;

public class Rectangle {
    private Point2D bottomLeft;
    private Point2D topRight;

    public Rectangle(Point2D bottomLeft, Point2D topRight){
        this.bottomLeft = bottomLeft;
        this.topRight = topRight;
    }
    public boolean contains(Point2D point) {
       boolean xContains = point.getX() >= bottomLeft.getX() && point.getX() <= topRight.getX();
       boolean yContains = point.getY() >= bottomLeft.getY() && point.getY() <= topRight.getY();
       return xContains && yContains;
    }
}
