import javax.swing.*;
import java.awt.*;

public class FenetreListener extends JFrame {
    private TimeEcouteur ecouteur;
    public FenetreListener(){
        this.setTitle("Fenetre du Listeneur ");
        this.setSize(400, 1000);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public void setEcouteur(TimeEcouteur ecouteur) {
        this.ecouteur = ecouteur;
    }

    public void label(){
        System.out.println("la");
        String affichage = ecouteur.toString();
        JTextArea textArea = new JTextArea(affichage);
        JScrollPane scrollPane = new JScrollPane(textArea);
        JPanel pan=new JPanel();
        pan.setBackground(Color.white);
        pan.add(textArea);
        this.setContentPane(pan);
        this.setVisible(true);
    }


}
