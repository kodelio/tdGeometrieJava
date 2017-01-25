package Geometrie;

public class Point implements InterPoint {
    private double x, y;

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public Point() {
        this.setX(0);
        this.setY(0);
    }

    public Point(double X, double Y) {
        this.setX(X);
        this.setY(Y);
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")";
    }
}