package gatomain;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.util.Random;

public class GatoMain extends JFrame implements ActionListener {

 private JButton [][]buttons = new JButton[3][3];
 private JButton playButton = new JButton("Aceptar");
 private JLabel statusLabel = new JLabel("");
 private GatoAI juego = null;
 private int humano = 0;
 private int IA = 0;
 private boolean jugando = false;
 private String []chars=new String[]{"","X","O"};

 private void setStatus(String s) {
  statusLabel.setText(s);
 }

 private void setButtonsEnabled(boolean enabled) {
  for(int i=0;i<3;i++)
   for(int j=0;j<3;j++) {
    buttons[i][j].setEnabled(enabled);
    if(enabled) buttons[i][j].setText(" ");
   }
 }
Random r = new Random();
int equiscirc = r.nextInt(2)+1;

 public GatoMain() {

  setTitle("Gato");
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setResizable(false);

  JPanel centerPanel = new JPanel(new GridLayout(3,3));
  Font font = new Font("Arial",Font.BOLD, 32);
  for(int i=0;i<3;i++)
   for(int j=0;j<3;j++) {
    buttons[i][j] = new JButton(" ");
    buttons[i][j].setFont(font);
    buttons[i][j].addActionListener(this);
    buttons[i][j].setFocusable(false);
    centerPanel.add(buttons[i][j]);
   }

  JPanel northPanel = new JPanel();
  northPanel.add(statusLabel);

  JPanel southPanel = new JPanel();

  setStatus("Que Comienze El Juego!!!");
  JOptionPane.showMessageDialog(null, "Que Comienze el juego", "INICIAR JUEGO",JOptionPane.QUESTION_MESSAGE);
  juego();
  setButtonsEnabled(true);

  add(northPanel,"North");
  add(centerPanel,"Center");
  add(southPanel,"South");

  setSize(300,300);

  setLocationRelativeTo(null);
 }

 private void computerTurn() {
  if(!jugando) return;

  int []pos = juego.nextMover(IA);
  if(pos!=null) {
   int i = pos[0];
   int j = pos[1];
   if(equiscirc==1){
    buttons[i][j].setText(chars[IA]);}
    else{
       buttons[i][j].setText(chars[humano]);
    }
   juego.setValor(i,j,IA);
  }

  verEstado();
 }

 private void gameOver(String s) {
  setStatus(s);
  setButtonsEnabled(false);
  jugando = false;
 }

 private void verEstado() {
  if(juego.ganador(humano)) {
    JOptionPane.showMessageDialog(null, "Felicitaciones,Ganaste esta partida!!!", "RESULTADO",JOptionPane.INFORMATION_MESSAGE);
    setButtonsEnabled(false);
    jugando = false;
  }
  if(juego.ganador(IA)) {
   JOptionPane.showMessageDialog(null, "Lastima,Perdiste esta partida!!!", "RESULTADO",JOptionPane.ERROR_MESSAGE);
   setButtonsEnabled(false);
   jugando = false;
  }
  if(juego.nextMover(humano)==null && juego.nextMover(IA)==null) {
      JOptionPane.showMessageDialog(null, "No lograste vencer,Empataste esta partida!!!", "RESULTADO",JOptionPane.WARNING_MESSAGE);
      setButtonsEnabled(false);
      jugando = false;
  }
 }

 private void click(int i,int j) {
  if(juego.getValor(i,j)==GatoAI.vacio) {
      if(equiscirc==1){
        buttons[i][j].setText(chars[humano]);
      }else{buttons[i][j].setText(chars[IA]);
      }
   juego.setValor(i,j,humano);
   verEstado();
   computerTurn();
  }
 }

 public void actionPerformed(ActionEvent event) {
  if(event.getSource()==playButton) {
   juego();
  }else {
   for(int i=0;i<3;i++)
    for(int j=0;j<3;j++)
     if(event.getSource()==buttons[i][j])
      click(i,j);
  }
 }

 private void juego() {
  juego = new GatoAI();
  humano = GatoAI.uno;
  IA = GatoAI.dos;
  setStatus("Juega");
  setButtonsEnabled(true);
  jugando = true;
 }
  public static void main(String []args) {
  new GatoMain().setVisible(true);
 }
}
