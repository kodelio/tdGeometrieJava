import Geometrie.Point;
import Geometrie.Polygone.Quadrilatere;
import Geometrie.Polygone.Rectangle;
import Geometrie.Polygone.Trapeze;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello World!");

        Point p1 = new Point(0, 0);
        Point p2 = new Point(1, 0);
        Point p3 = new Point(1, 1);
        Point p4 = new Point(0, 1);

        Trapeze trapeze = new Trapeze(p1, p2, p3, p4);
        //Quadrilatere quadrilatere = new Quadrilatere(p1, p2, p3, p4);
        Rectangle rectangle = new Rectangle(p1, p2, p3, p4);

        System.out.println(rectangle);
    }
}
