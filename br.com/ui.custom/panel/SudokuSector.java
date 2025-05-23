package br.com.ui.custom.panel;

import javax.swing.JPanel;
import java.awt.Dimension;

import static java.awt.Color.black;


public class SudokuSector extends JPanel {

    public SudokuSector(){

    var dimension = new Dimension(width: 170, heigth: 170);
    this.setSize(dimension);
    this.setPreferredSize(dimension);
    this.setBorder(new LineBorder(black, thickness: 2, roundedCorners: true ));
    this.setVisible(true);

    }

}
