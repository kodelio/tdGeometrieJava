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

    protected String afficheSommets(){
        String returnString = new String();
        for (Point point : points){
            returnString += " (" + point.getAbscisse() + "," + point.getOrdonnee() + ")";
        }
        return returnString;
    }

    @Override
    public String toString() {
        return "Je suis un " + type + ". Mes sommets sont " + afficheSommets();

    }

    public Quadrilatere() {

    }

    public Quadrilatere(Point[] points) {
        this.points = points;
    }
}
