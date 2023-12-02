public class Etudiant extends Personne {

    public Etudiant (String nom, String prenom, int age, String classe){
        super(nom,prenom,age);
        this.classe = classe;
    }

    public Etudiant(){

    }
    private  String classe;

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    @Override
    public String toString() {
        return "Etudiant{" +
                super.getNom() + " "+super.getPrenom()+ " "+super.getAge()+" "+
                " "+classe + '\'' +
                '}';
    }
}
