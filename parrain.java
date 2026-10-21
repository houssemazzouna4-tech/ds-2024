
package parrain;

public class parrain {
    private int idParrain;
    private personne personne;
    private int nbEnfantP;
    private enfant[] mesEnfants;

    public parrain(String nom, String prenom, int age, int idParrain) {
        personne = new personne(nom, prenom, age);
        this.idParrain = idParrain;
        nbEnfantP = 0;
        mesEnfants = new enfant[100];
    }

    public void ajouterEnfant(enfant enfant) {
        if (enfant != null && nbEnfantP < mesEnfants.length) {
            mesEnfants[nbEnfantP] = enfant;
            nbEnfantP++;
        }
    }

    public int getNbEnfantP() {
        return nbEnfantP;
    }

    public enfant getEnfant(int i) {
        if (i >= 0 && i < nbEnfantP) {
            return mesEnfants[i];
        }
        return null;
    }

    public void afficherInfos() {
        personne.afficherInfos();
        System.out.println("Id Parrain : " + idParrain);
        System.out.println("Nombre d'enfants : " + nbEnfantP);

        for (int i = 0; i < nbEnfantP; i++) {
            mesEnfants[i].afficherInfos();
        }
    }
}
