package br.com.ui.custom.panel;

import javax.swing.JPanel;
import java.awt.Dimension;

import static java.awt.Color.black;


public class MainPanel extends JPanel {

    public MainPanel(final Dimension dimension){
        this.setSize(dimension);
        this.setPreferredSize(dimension);
    }


}