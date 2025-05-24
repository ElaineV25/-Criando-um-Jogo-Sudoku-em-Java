package br.com.ui.custom.model;

import java.awt.Font;
import java.util.EventListener;

import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

import br.com.service.EventEnum;

public class NumberText extends JTextField implements EventListener{

    private final Space space;

    public NumberText(final Space space) {
        this.space = space;
        this.dimension = new Dimension(50, 50);
        this.setSize(dimension);
        this.setPreferredSize(dimension);
        this.setVisible(true);
        this.setFont( new Font("Arial", PLAIN,20 ));
        this.setHorizontalAlignment(CENTER);
        this.setDocument(new NumberText);
        this.setEnabled(!space.isFixed());
        if (space.isFixed()){
            this.setText(space.getActual().toString());

        }
        this.getDocument().addDocumentListener(new DocumentListener() {

            private void changeSpace(){
                if (getText().isEmpty()){
                    space.clearSpace();
                    return;
                }
                space.setActual(Integer.parseInt(getText()));
            }

            @Override
            public void insertUpdate(DocumentEvent e) {
                changeSpace();
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changeSpace();
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                changeSpace();
            }
            
        });


    }

    @Override
    public void update(final EventEnum eventType){
        if (eventType.equals(EventEnum.CLEAR_SPACE)&& (this.isEnabled())){
            this.setText("");
        }
    }

    
}
