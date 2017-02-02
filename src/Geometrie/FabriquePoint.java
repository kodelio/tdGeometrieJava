/**
 * Laurent Toson & Raphael Haltz
 */

package Geometrie;

import java.lang.reflect.InvocationTargetException;

/**
 * Classe FabriquePoint
 */
public class FabriquePoint {

    /**
     * Constructeur
     */
    public FabriquePoint() {
        return;
    }

    /**
     * Création d'un point avec le constructeur
     * @param x
     * @param y
     * @param s
     * @return un point (Point ou Point2)
     */
    public static InterPoint create(double x, double y, String s) {
        InterPoint p = null;
        try {
            p = (InterPoint) Class.forName(s).getConstructor(double.class, double.class).newInstance(x, y);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return p;
    }

    /**
     * Création d'un point avec un constructeur par défaut
     * @param s
     * @return un point (Point ou Point2)
     */
    public static InterPoint create(String s) {
        InterPoint p = null;
        try {
            p = (InterPoint) Class.forName(s).getConstructor().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

        return p;
    }
}