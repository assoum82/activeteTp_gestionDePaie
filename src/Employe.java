
public class Employe {
    private String nom;
    private String job;
    private double salaire;
    private int absence;

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Employe(String nom, String job) {
        this.nom = nom;
        this.job = job;
    }

    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    public String getNom() {
        return nom;
    }

    public String getJob() {
        return job;
    }

    public double getSalaire() {
        return salaire;
    }

    public int getAbsence() {
        return absence;
    }

    public void setAbsence(int absence) {
        this.absence = absence;
    }

    public double calculPaie() {
        return salaire;
    }

    public void chequePaie() {
        System.out.println(nom + "( " + job + " ) " );

    }
// une méthode pour les absences et j'ai redifinir dans la class employeTempPlein et employeTempPartiel
    public int FeullePresence(){
        return absence;
    }

}
