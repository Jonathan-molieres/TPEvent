import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FenetreGenerate extends JFrame implements ActionListener{
    private TimeGenerater generate;
    private JButton button;
    private FenetreListener list;
    public FenetreGenerate(){
        list = new FenetreListener();//fenetre d'ecoute

        TimeEcouteur ecouteur = new TimeEcouteur();
        this.generate= new TimeGenerater();
        generate.addTimeListener(ecouteur);
        this.list.setEcouteur(ecouteur);
        this.setTitle("Fenetre du Générateur");
        this.setSize(400, 100);
        //pan
        JPanel pan =new JPanel();
        pan.setSize(400,300);
        pan.setBackground(Color.BLUE);
        this.button=new JButton("Generer un event");
        pan.add(this.button, BorderLayout.CENTER);
        this.button.addActionListener(this);
        this.setContentPane(pan);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        this.setVisible(true);

    }
    public void actionPerformed(ActionEvent event){
        if (this.button == event.getSource()){
            generate.generateEvent();
            this.list.label();
        }
    }

}

