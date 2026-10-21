
package parrain;

public class personne {
    private String nom;
    private String prenom;
    private int age;

    public personne(String nom, String prenom, int age) {
        this.nom = nom;
        this.prenom = prenom;
        setAge(age);
    }

    public void afficherInfos() {
        System.out.println("\nNom : " + nom);
        System.out.println("Prenom : " + prenom);
        System.out.println("Age : " + age);
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("L'age doit etre positif.");
        }
    }
}
