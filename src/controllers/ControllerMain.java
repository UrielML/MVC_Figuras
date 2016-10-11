
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import models.*;
import views.*;

/**
 *
 *
 */
public class ControllerMain implements ActionListener{
    
   ViewMain viewMain;
    ModelMain modelMain;
     
    JPanel views[];
    public ControllerMain(ViewMain viewMain, ModelMain modelMain, JPanel[] views){
        this.viewMain = viewMain;
        
        this.modelMain = modelMain;
      
       this.views=views;
        this.viewMain.jmi_Area.addActionListener(this);
        this.viewMain.jmi_Perimetro.addActionListener(this);
        this.viewMain.jmi_volumen.addActionListener(this);
        
        init_view();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==viewMain.jmi_Area)
            jmi_AreaActionPerformed();
         else if(ae.getSource()==viewMain.jmi_Perimetro){
             jmi_PerimetroActionPerfomed();
         }
         else if(ae.getSource()==viewMain.jmi_volumen){
             jmi_volumenActionPerfomed();
         }
         else if(ae.getSource()==viewMain.jmi_volumen){
        jmi_volumenActionPerfomed();
    }
    }
    
    public void jmi_AreaActionPerformed(){
        this.viewMain.setContentPane(views[0]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
     public void jmi_PerimetroActionPerfomed(){
        this.viewMain.setContentPane(views[1]);
        this.viewMain.revalidate();
        this.viewMain.repaint(); 
     }
     public void jmi_volumenActionPerfomed(){
        this.viewMain.setContentPane(views[2]);
        this.viewMain.revalidate();
        this.viewMain.repaint(); 
     }
     public void init_view(){
        this.viewMain.setTitle("Calculos de area, perimetro y volumen de figuras");
        this.viewMain.setLocationRelativeTo(null);
        this.viewMain.setVisible(true);
        
            
        }
    
}
