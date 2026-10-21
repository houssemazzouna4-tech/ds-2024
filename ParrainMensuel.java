
package parrain;

public class ParrainMensuel extends parrain {
    private double virementMensuel;

    public ParrainMensuel(String nom, String prenom, int age,int idParrain, double virementMensuel) {
        super(nom, prenom, age, idParrain);
        this.virementMensuel = virementMensuel;
    }

    public double calculerVirementTotal() {
        return getNbEnfantP() * virementMensuel;
    }

    public double getVirementMensuel() {
        return virementMensuel;
    }

    public int getnbreEnfantsParraines() {
        return getNbEnfantP();
    }

    public void afficherInfos() {
        super.afficherInfos();
        System.out.println("Virement mensuel : " + virementMensuel);
        System.out.println("Virement total : " + calculerVirementTotal());
    }
}
