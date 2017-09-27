import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JOptionPane;

/*
 * @author andreszapata
 */
public class Gato extends JFrame{
    static Random ran = new Random();
    static Boton[] botones= new Boton[9];
    static ArrayList<Integer> usados = new ArrayList();
    static String player;
    static String com;
    static boolean ban = true;
    public Gato(){
        super("Juego Gato");
        setLayout(new GridLayout(3,3));
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   

        
        for (int i = 0; i < botones.length; i++) {
            botones[i] = new Boton(" ",i);
            botones[i].addActionListener(new OyenteBoton());
            add(botones[i]);  
        }
        
        
        setSize(300,300);
        
        if(ran.nextInt(2) == 0){
            player = "X";
            com = "O";
        }else{
            player = "O";
            com = "X";
        }
        
        
    }

    private static class OyenteBoton implements ActionListener {
        Boton x;
        Boton y;
        
        @Override
        public void actionPerformed(ActionEvent e) {
            x = (Boton)e.getSource();
            
            if(x.getText().equals(" ")){
                ban = true;
                usados.add(x.getId());
                if(usados.size() != botones.length){
                    while(ban == true){
                        ban = false;
                        y = botones[ran.nextInt(9)];
                        for (int i = 0; i < usados.size(); i++) {
                            if(y.getId() == usados.get(i)){
                                ban = true;
                            }
                        }
                    }    
                    usados.add(y.getId());
                }else{
                    y=x;
                }
                y.setText(com);
                x.setText(player);
            }
            
            if(reglas() == 0 ){
                if(botones[0].getText().equals(player)){
                    JOptionPane.showMessageDialog(new JFrame("wow"), "ganaste");
                    System.exit(0);
                }
                if(botones[0].getText().equals(com)){
                    JOptionPane.showMessageDialog(new JFrame("wow"), "perdiste");
                    System.exit(0);
                }
            }if(reglas() == 8 ){
                if(botones[8].getText().equals(player)){
                    JOptionPane.showMessageDialog(new JFrame("wow"), "ganaste");
                    System.exit(0);
                }
                if(botones[8].getText().equals(com)){
                    JOptionPane.showMessageDialog(new JFrame("wow"), "perdiste");
                    System.exit(0);
                }
            }if(reglas() == 4 ){
                if(botones[4].getText().equals(player)){
                    JOptionPane.showMessageDialog(new JFrame("wow"), "ganaste");
                    System.exit(0);
                }
                if(botones[4].getText().equals(com)){
                    JOptionPane.showMessageDialog(new JFrame("wow"), "perdiste");
                    System.exit(0);
                }
            }if(usados.size() == 9){
                JOptionPane.showMessageDialog(new JFrame("wow"), "no hay necesidad de jugar mas, ha empatado");
                    System.exit(0);
            }
        }
    
    private static int reglas(){
        if(botones[0].getText() != " " && botones[0].getText().equals(botones[1].getText()) && botones[1].getText().equals(botones[2].getText())){
            return 0;
        }
        if(botones[0].getText() != " " && botones[0].getText().equals(botones[4].getText()) && botones[4].getText().equals(botones[8].getText())){
            return 4;
        }
        if(botones[0].getText() != " " && botones[0].getText().equals(botones[3].getText()) && botones[3].getText().equals(botones[6].getText())){
            return 0;
        }
        if(botones[2].getText() != " " && botones[2].getText().equals(botones[4].getText()) && botones[4].getText().equals(botones[6].getText())){
            return 4;
        }
        if(botones[2].getText() != " " && botones[2].getText().equals(botones[5].getText()) && botones[5].getText().equals(botones[8].getText())){
            return 8;
        }
        if(botones[6].getText() != " " && botones[6].getText().equals(botones[7].getText()) && botones[7].getText().equals(botones[8].getText())){
            return 8;
        }
        if(botones[3].getText() != " " && botones[3].getText().equals(botones[4].getText()) && botones[4].getText().equals(botones[5].getText())){
            return 4;
        }
        if(botones[1].getText() != " " && botones[1].getText().equals(botones[4].getText()) && botones[4].getText().equals(botones[7].getText())){
            return 4;
        }
        else{return 10;}
        }
    }
}