package br.com.ui.custom.panel;

import javax.swing.JPanel;

import br.com.ui.custom.model.NumberText;

import java.awt.Dimension;
import java.util.List;

import static java.awt.Color.black;


public class SudokuSector extends JPanel {

    public SudokuSector(final List<NumberText> textFields){

    var dimension = new Dimension(width: 170, heigth: 170);
    this.setSize(dimension);
    this.setPreferredSize(dimension);
    this.setBorder(new LineBorder(black, thickness: 2, roundedCorners: true ));
    this.setVisible(true);
    textFields.forEach(this.add);

    }

}
