package br.com.ui.custom;

import javax.swing.JButton;


public class buttonCheckGameStatusButton extends JButton {

 public buttonCheckGameStatusButton(final ActionListener actionListener){
    this.setText("Verificar jogo");
    this.addActionListener(actionListener);
 }
}