import javax.swing.*;
import java.awt.*;

public class Teste  extends JPanel {
    Teste() {

        Employe exemple[] = new Employe[3];

        exemple[0] = new Employe("Salim", "PDG");
        exemple[0].setSalaire(100000 DA);
        exemple[0].chequePaie();
        exemple[1] = new EmployeTempPartiel("Halima", "Secrétaire");
        ((EmployeTempPartiel) exemple[1]).setMontant_heur(20000 DA);
        exemple[1].FeuillePresence();
        exemple[1].chequePaie();
        exemple[2] = new EmployeTempPlein("AbdeHalim", "Agent de sécurité");
        ((EmployeTempPlein)exemple[2]) .setMontant_semaine(15000 DA);
        exemple[2].FeuillePresence();
        ((EmployeTempPlein)exemple[2]).setPrime(500 DA);
        exemple[2].chequePaie();


        String[] ligne = {"Nom", "fonction", "Salaire"};
        String[][] data = {{exemple[0].getNom(), exemple[0].getJob(), exemple[0].getSalaire() + ""}
                          ,{exemple[1].getNom(), exemple[1].getJob(), exemple[1].getSalaire() + ""}
                          ,{exemple[2].getNom(), exemple[2].getJob(), exemple[2].getSalaire() + ""}};


        JTable jt = new JTable(data, ligne);


        jt.setPreferredScrollableViewportSize(new Dimension(450, 50));
        jt.setFillsViewportHeight(true);
        JScrollPane jps = new JScrollPane(jt);

        String[][] data1 = {{exemple[0].getNom(), exemple[0].getJob(), ((EmployeTempPartiel)exemple[0]).calculPaie() + ""}
                , {exemple[1].getNom(), exemple[1].getJob(), ((EmployeTempPlein)exemple[1]).calculPaie() + ""
                  , exemple [2].getNom(),exemple[2].getjob(),((EmpyeTempsPlein)exexmple[2].calculPaie()+""}};


        JTable jt1 = new JTable(data1, ligne);
        jt1.setPreferredScrollableViewportSize(new Dimension(350, 63));
        jt1.setFillsViewportHeight(true);
        JScrollPane jps1 = new JScrollPane(jt1);
        add(jps);
        add(jps1);

    }


    public static void main(String[] args) {
        JFrame f = new JFrame();
        Teste t = new Teste();
        f.setTitle("Gestion Employer");
        f.setSize(600, 400);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(t);

    }


}
