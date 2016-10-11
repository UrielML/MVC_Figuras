/*
Implementacion del Controllador de Areas
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.ViewArea;
import models.ModelArea;
import ddhl.Conversiones;
/**
 *
 * 
 */
public class ControllerArea implements ActionListener{
    private final ViewArea viewArea;
    private final ModelArea modelArea;
    Conversiones con = new Conversiones();
    public ControllerArea(ViewArea viewArea,ModelArea modelArea){
        this.viewArea = viewArea;
        this.modelArea = modelArea;
        this.viewArea.jbtn_calcularA.addActionListener(this);
        this.viewArea.jcb_figuraA.addActionListener(this);
    }
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(viewArea.jcb_figuraA.getSelectedItem().equals("Esfera")){
                this.viewArea.jtf_radio.setVisible(true);
            }else if(viewArea.jcb_figuraA.getSelectedItem().equals("Cilindro")){
                this.viewArea.jtf_radio.setVisible(true);
            }else if(viewArea.jcb_figuraA.getSelectedItem().equals("Cubo")){
                this.viewArea.jtf_radio.setVisible(false);
            }
     if(e.getSource()==viewArea.jbtn_calcularA){
           this.modelArea.setAltura(con.stringToDouble(this.viewArea.jtf_altura.getText()));
           this.modelArea.setRadio(con.stringToDouble(this.viewArea.jtf_radio.getText()));
            if(viewArea.jcb_figuraA.getSelectedItem().equals("Cilindro")){
                this.modelArea.cilindro();
                this.viewArea.jtf_resultado.setText(""+this.modelArea.getResultadoa());
                
            }
            else if(viewArea.jcb_figuraA.getSelectedItem().equals("Esfera")){
               this.modelArea.esfera();
               this.viewArea.jtf_resultado.setText(""+this.modelArea.getResultadoa());
            }
            else if(viewArea.jcb_figuraA.getSelectedItem().equals("Cubo")){
                this.modelArea.cubo();
                this.viewArea.jtf_resultado.setText(""+this.modelArea.getResultadoa());
                
            }
        }
    }
}
