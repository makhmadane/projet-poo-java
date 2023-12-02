import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Etudiant etudiant = new Etudiant("diop","abdou",18,"L2GL");
        /*etudiant.setNom("diop");
        etudiant.setPrenom("Abdou");
        etudiant.setAge(15);
        etudiant.setClasse("L3GL");*/
        //System.out.println(etudiant.getNom()+" "+etudiant.getPrenom());
        //System.out.println(etudiant.toString());
        Professeur professeur = new Professeur();
        professeur.setAge(16);
        professeur.setPrenom("Diouf");
        professeur.setNom("Awa");
        List<Personne> personnes = new ArrayList<>();
        personnes.add(etudiant);
        personnes.add(professeur);

        for (Personne personne : personnes) {
            if( personne instanceof  Professeur)
                System.out.println( personne.toString());
        }
    }
}