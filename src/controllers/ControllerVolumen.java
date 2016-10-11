/*
Implementacion del control de volumen
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JComboBox;
import views.ViewVolumen;
import models.ModelVolumen;
import ddhl.Conversiones;
/**
 *
 *
 */

public class ControllerVolumen implements ActionListener{
    private final ViewVolumen viewVolumen;
    private final ModelVolumen modelVolumen;
    Conversiones con = new Conversiones();
    public ControllerVolumen(ViewVolumen viewConversion, ModelVolumen modelVolumen){
        this.viewVolumen = viewConversion;
        this.modelVolumen = modelVolumen;
        this.viewVolumen.jbtn_calcular.addActionListener(this);
        this.viewVolumen.jcb_figurav.addActionListener(this);
        
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(viewVolumen.jcb_figurav.getSelectedItem().equals("Esfera")){
                this.viewVolumen.jtf_area.setVisible(false);
                this.viewVolumen.jtf_radio.setVisible(true);
            }else if(viewVolumen.jcb_figurav.getSelectedItem().equals("Cono")){
                this.viewVolumen.jtf_area.setVisible(false);
                this.viewVolumen.jtf_radio.setVisible(true);
            }
        if(viewVolumen.jcb_figurav.getSelectedItem().equals("Prisma")){
                this.viewVolumen.jtf_radio.setVisible(false);
                this.viewVolumen.jtf_area.setVisible(true);
            }
        if(e.getSource()==viewVolumen.jbtn_calcular){
            this.modelVolumen.setAltura(con.stringToDouble(this.viewVolumen.jtf_alturaV.getText()));
            this.modelVolumen.setAreaBase(con.stringToDouble(this.viewVolumen.jtf_area.getText()));
            this.modelVolumen.setRadio(con.stringToDouble(this.viewVolumen.jtf_radio.getText()));
            if(viewVolumen.jcb_figurav.getSelectedItem().equals("Cono")){
                this.modelVolumen.cono();
                this.viewVolumen.jtf_resultado.setText(""+this.modelVolumen.getResultado());
            }
            if(viewVolumen.jcb_figurav.getSelectedItem().equals("Esfera")){
                this.modelVolumen.esfera();
                this.viewVolumen.jtf_resultado.setText(""+this.modelVolumen.getResultado());
                
            }
            if(viewVolumen.jcb_figurav.getSelectedItem().equals("Prisma")){
                this.modelVolumen.prisma();
                this.viewVolumen.jtf_resultado.setText(""+this.modelVolumen.getResultado());
            }
        }
    }
    
    
}
