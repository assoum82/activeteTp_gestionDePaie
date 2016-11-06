import java.util.Scanner;

public class EmployeTempPartiel extends Employe {
    private Scanner cv=new Scanner (System.in);
    private final double heurs = 35;
    private double montant_heur;

    public EmployeTempPartiel(String nom, String job)
    {
        super(nom, job);
    }

    public double calculPaie() {
        if (!(getAbsence()> 3))
            setSalaire(montant_heur * (heurs - 1));
        else
        setSalaire(montant_heur);
        return getSalaire();
    }

    public void setMontant_heur(double montant_heur) {
        this.montant_heur = montant_heur;
    }

    public int FeullePresence(){
        int f=0;
        for(int i=0;i<4;i++){
            System.out.print("jour " +  (i+1) + " " );
            String   choix=cv.nextLine();
            if(choix=="absent"){
                setAbsence(f++);
            }
        }
        return getAbsence();
    }

}
