/**
 * Laurent Toson & Raphael Haltz
 */

import java.util.ArrayList;
import Geometrie.*;
import Geometrie.Polygone.*;

public class Main {

    public static void main(String[] args) {
        // Création des points
        InterPoint A = new Point(0, 0);
        System.out.println(A.toString());
        InterPoint B = new Point2(0, 1);
        System.out.println(B.toString());
        InterPoint C = new Point2(90, 1);
        System.out.println(C.toString());
        InterPoint D = new Point(1, 0);
        System.out.println(D.toString());

        // Création des quadrilatères
        Quadrilatere Q = new Quadrilatere(A, B, C, D, "bleu", "jaune");
        System.out.println(Q.toString());
        Parallelogramme P = new Parallelogramme(A, B, C, D, "vert", "noir");
        System.out.println(P.toString());
        Carre c = new Carre(A, B, C, D, "bleu", "jaune");
        System.out.println(c.toString());
        Trapeze T = new Trapeze(A, B, C, D, "bleu", "jaune");
        System.out.println(T.toString());
        Losange L = new Losange(A, B, C, D, "blanc", "orange");
        System.out.println(L.toString());
        Rectangle R = new Rectangle(A, B, C, D, "marron", "jaune");
        System.out.println(R.toString());
        CerfVolant V = new CerfVolant(A, B, C, D, "rouge", "noir");
        System.out.println(V.toString());

        // Test de la classe FabriqueQuadrilatere
        System.out.println("\n Test FabriqueQuadrilatere");
        new FabriqueQuadrilatere();
        Quadrilatere a = FabriqueQuadrilatere.create(0, -1, 0, 1, 1, 1, -1, 0, "Geometrie.Polygone.Losange", "Geometrie.Point", "rouge", "bleu");
        System.out.println(a.toString());

        System.out.println("\n\n");
        ArrayList<Quadrilatere> elements = new ArrayList<>();

        // Ajout des éléments dans la liste
        elements.add(Q);
        elements.add(P);
        elements.add(c);
        elements.add(T);
        elements.add(L);
        elements.add(R);
        elements.add(V);

        // Affichage de la liste
        for (int i = 0; i < elements.size(); i++) {
            System.out.println(elements.get(i).toString());
        }
    }
}