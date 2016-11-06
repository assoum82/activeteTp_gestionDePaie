import java.util.Scanner;

public class EmployeTempPlein extends Employe{
    private Scanner cv=new Scanner (System.in);
    private double montant_semaine;
    private double prime;

    public EmployeTempPlein(String nom, String job) {

        super(nom, job);
    }

    public double getMontant_semaine() {
        return montant_semaine;
    }

    public double calculPaie() {
        if (!(getAbsence() > 3))
            setSalaire(montant_semaine*4);
        else
            setSalaire(montant_semaine*4+prime);
        return getSalaire();
    }

    public void setMontant_semaine(double montant_semaine) {
        this.montant_semaine = montant_semaine;
    }

    public void setPrime(double prime) {
        this.prime = prime;
    }

    public int FeullePresence(){
        int f=0;
        for(int i=0;i<4;i++){
            System.out.print("l'heur " +  (i+1) + " " );
            String   choix=cv.nextLine();
            if(choix=="absent"){
                setAbsence(f++);
            }
        }
        return getAbsence();
    }
}
