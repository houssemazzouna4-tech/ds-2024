
package parrain;

public class enfant {
    private static int compteur = 0;
    private int idEnfant;
    private String classe;
    private personne personne;

    public enfant(String nom, String prenom, int age) {
        personne = new personne(nom, prenom, age);
        compteur++;
        idEnfant = compteur;
    }

    public enfant(String nom, String prenom, int age, String classe) {
        this(nom, prenom, age);
        this.classe = classe;
    }

    public enfant(String nom, String prenom, int age, String classe, int idEnfant) {
        this(nom, prenom, age, classe);
        this.idEnfant = idEnfant;
    }

    public String getClasse() {
        return classe;
    }

    public void afficherInfos() {
        personne.afficherInfos();
        System.out.println("ID Enfant : " + idEnfant);
        System.out.println("Classe : " + classe);
    }
}
