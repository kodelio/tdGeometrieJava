package Geometrie.Polygone;

import Geometrie.Point;

/**
 * Created by rhaltz on 20/01/2017.
 */
public class Quadrilatere {

    protected String type = "quadrilatère quelconque";

    protected Point points[] = new Point[4];

    private String affiche(){
        return this.toString();
    }

    @Override
    public String toString() {
        return "Je suis un " + type + ". Mes sommets";

    }

    public Quadrilatere() {

    }

    public Quadrilatere(Point[] points) {
        this.points = points;
    }
}
