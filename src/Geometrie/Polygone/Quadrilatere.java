package Geometrie.Polygone;

import Geometrie.ObjetGeometrique;
import Geometrie.Point;
import Geometrie.Propriete;

import java.util.ArrayList;

/**
 * Created by rhaltz on 20/01/2017.
 */
public class Quadrilatere extends ObjetGeometrique{

    protected String type() {
        return "quadrilatère quelconque";
    }

    protected Point points[] = new Point[4];

    protected String propriete(){
        return "";
    }

    private String affiche(){
        return this.toString();
    }

    protected String coordonnees(){
        String returnString = new String();
        for (Point point : points){
            returnString += " (" + point.getAbscisse() + "," + point.getOrdonnee() + ")";
        }
        return returnString;
    }

    @Override
    public String toString() {
        return "Je suis un " + type() + ". Mes sommets sont " + coordonnees();

    }

    public Quadrilatere(Point p1, Point p2, Point p3, Point p4) {
        points[0] = p1;
        points[1] = p2;
        points[2] = p3;
        points[3] = p4;
    }
}
