package Geometrie.Polygone;

import Geometrie.Point;
import Geometrie.Propriete;

/**
 * Created by laurent on 20/01/2017.
 */
public class Parallelogramme extends Trapeze {
    @Override
    protected String type() {
        return super.type() + " et un parallélogramme";
    }



    public Parallelogramme(Point p1, Point p2, Point p3, Point p4) {

        super(p1, p2, p3, p4);
        addPropriete(new Propriete("Prop Parallelogramme 1"));
        addPropriete(new Propriete("Prop Parallelogramme 2"));
    }
}
