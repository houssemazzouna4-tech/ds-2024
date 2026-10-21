
package parrain;

public class ProgrammeParrainage {
    public static void main(String[] args) {

        parrain[] parrains = new parrain[10];

        parrains[0] = new parrain("Ali", "Ben Ali", 40, 1);
        parrains[1] = new parrain("Salah", "Ben Salah", 35, 2);
        parrains[2] = new ParrainMensuel("Tounes", "Ben Tounes", 45, 3, 100.0);

        enfant[] enfants = new enfant[4];

        enfants[0] = new enfant("Farah", "ben Farah", 10,"quatrième année");
        enfants[1] = new enfant("Amel", "ben Amel", 12, "Sixième année");
        enfants[2] = new enfant("Fedy", "Ben Fedy", 11, "Sixième année");
        enfants[3] = new enfant("Sarra", "Ben Sarra", 9, "Troisième année");

        parrains[0].ajouterEnfant(enfants[0]);

        parrains[2].ajouterEnfant(enfants[1]);
        parrains[2].ajouterEnfant(enfants[2]);

        int total = 0;

        for (int i = 0; i < parrains.length; i++) {
            if (parrains[i] != null) {
                total += parrains[i].getNbEnfantP();
            }
        }

        System.out.println("\nNombre total d'enfants parraines : " + total);

        System.out.println("\nEnfants en Sixième année :");

        for (int i = 0; i < parrains.length; i++) {
            if (parrains[i] != null) {
                for (int j = 0;
                     j < parrains[i].getNbEnfantP(); j++) {

                    enfant e = parrains[i].getEnfant(j);

                    if (e != null && e.getClasse() != null && e.getClasse().trim().equalsIgnoreCase("Sixième année")) {
                        e.afficherInfos();
                    }
                }
            }
        }

        double totalVirements = 0;

        for (int i = 0; i < parrains.length; i++) {
            if (parrains[i] instanceof ParrainMensuel) {
                totalVirements +=((ParrainMensuel) parrains[i]).calculerVirementTotal();
            }
        }

        System.out.println(
            "\nMontant total des virements mensuels : "+ totalVirements
        );
    }
}
