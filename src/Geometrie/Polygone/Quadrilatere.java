package Geometrie.Polygone;

import Geometrie.ObjetGeometrique;
import Geometrie.Point;
import Geometrie.Propriete;

import java.util.ArrayList;

/**
 * Created by rhaltz on 20/01/2017.
 */
public class Quadrilatere extends ObjetGeometrique{

    protected String type = "quadrilatère quelconque";

    protected Point points[] = new Point[4];

    protected String propriete(){

    }

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
        this.addPropriete(new Propriete(""));
    }

    public Quadrilatere(Point pointA, Point pointB, Point pointC, Point pointD) {
        this();
        this.points = points;
    }
}
