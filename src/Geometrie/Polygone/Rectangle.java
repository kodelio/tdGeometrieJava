package Geometrie.Polygone;

import Geometrie.Point;
import Geometrie.Propriete;

/**
 * Created by laurent on 20/01/2017.
 */
public class Rectangle extends Parallelogramme {
    @Override
    protected String type() {
        return super.type() + " et un rectangle";
    }



    public Rectangle(Point p1, Point p2, Point p3, Point p4) {
        super(p1, p2, p3, p4);
        addPropriete(new Propriete("Prop Rectangle 1"));
        addPropriete(new Propriete("Prop Rectangle 2"));
    }
}
