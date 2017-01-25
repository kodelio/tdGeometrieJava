package Geometrie;

public class Point2 implements InterPoint {
    private double angle;
    private double rayon;

    public double getAngle() {
        return angle;
    }

    public void setAngle(float angle) {
        if (angle >= 360) {
            System.out.println("angle supérieur a 360°");
        }
        this.angle = angle;
    }

    public double getRayon() {
        return rayon;
    }

    public void setRayon(float rayon) {
        this.rayon = rayon;
    }

    public Point2() {
        this.angle = 0;
        this.rayon = 0;
    }


    public Point2(double angle, double rayon) {
        this.angle = angle;
        this.rayon = rayon;
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")";
    }

    public double getX() {
        double x = (rayon * Math.cos(Math.toRadians(angle)));
        return Math.round(x);
    }

    public double getY() {
        double y = (rayon * Math.sin(Math.toRadians(angle)));
        return Math.round(y);
    }
}