package Geometrie;

import java.util.ArrayList;

/**
 * Created by rhaltz on 20/01/2017.
 */
public abstract class ObjetGeometrique {
    private ArrayList<Propriete> propriete = new ArrayList<>();

    public void addPropriete(Propriete propriete) {
        this.propriete.add(propriete);
    }

    public ArrayList<Propriete> getPropriete() {
        return propriete;
    }

    protected String propriete(){
        String returnString = new String();
        for (Propriete propriete : getPropriete()){
            returnString += " " + propriete + ",";
        }
        //TODO check for last item : no coma
        return returnString;
    }
}
