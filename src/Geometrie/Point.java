/**
 * Laurent Toson & Raphael Haltz
 */

package Geometrie;

/**
 * Classe Point
 */
public class Point implements InterPoint {
    private double x, y;

    /**
     * Get et set des points
     */

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

    /**
     * Constructeur par défaut
     */
    public Point() {
        this.setX(0);
        this.setY(0);
    }

    /**
     * Constructeur
     * @param X
     * @param Y
     */
    public Point(double X, double Y) {
        this.setX(X);
        this.setY(Y);
    }

    @Override
    public String toString() {
        return "(" + this.getX() + "," + this.getY() + ")";
    }
}