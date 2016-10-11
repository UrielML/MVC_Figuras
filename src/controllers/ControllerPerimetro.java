
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import models.ModelPerimetro;
import views.ViewPerimetro;
import ddhl.Conversiones;
/**
 *
 * 
 */
public class ControllerPerimetro implements ActionListener{
    
    private ModelPerimetro modelPerimetro;
    private ViewPerimetro viewPerimetro;
    Conversiones conversiones=new Conversiones();
  

    public ControllerPerimetro(ViewPerimetro viewPerimetro, ModelPerimetro modelPerimetro) {
        this.modelPerimetro=modelPerimetro;
        this.viewPerimetro=viewPerimetro;
        this.conversiones=conversiones;
        
        this.viewPerimetro.jbtn_resultado.addActionListener(this);
    }
    public void init_view(){
        this.viewPerimetro.jtf_alturaRectangulo.setText(""+this.modelPerimetro.getAlturaRectangulo());
        this.viewPerimetro.jtf_baseRectangulo.setText(""+this.modelPerimetro.getBaseRectangulo());
        this.viewPerimetro.jtf_baseTriangulo.setText(""+this.modelPerimetro.getBaseTriangulo());
        this.viewPerimetro.jtf_ladoCuadrado.setText(""+this.modelPerimetro.getLadoCuadrado());
        this.viewPerimetro.jtf_ladoTriangulo.setText(""+this.modelPerimetro.getLadoTriangulo());
        
        this.viewPerimetro.setVisible(true);
    }
    public double Rectangulo(){
        double baseRectangulo=conversiones.stringToDouble(this.viewPerimetro.jtf_baseRectangulo.getText());
        double alturaRectangulo=conversiones.stringToDouble(this.viewPerimetro.jtf_alturaRectangulo.getText());
        double PerimetroR= 2*(baseRectangulo+alturaRectangulo);
        
        return  PerimetroR;
        
    }
    public double Triangulo(){
       double ladoTriangulo=conversiones.stringToDouble(""+this.viewPerimetro.jtf_ladoTriangulo.getText());
       double baseTriangulo=conversiones.stringToDouble(""+this.viewPerimetro.jtf_baseTriangulo.getText());
       double PerimetroT=(2*ladoTriangulo)+baseTriangulo;
       return  PerimetroT;
    }
    public double Cuadrado(){
       double ladoCuadrado=conversiones.stringToDouble(this.viewPerimetro.jtf_ladoCuadrado.getText());
       double PerimetroC=4*ladoCuadrado;
       return  PerimetroC;
    }
    
    

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==viewPerimetro.jbtn_resultado){
            this.viewPerimetro.jtf_alturaRectangulo.setVisible(true);
            this.viewPerimetro.jtf_baseRectangulo.setVisible(true);
            this.viewPerimetro.jtf_ladoTriangulo.setVisible(true);
            this.viewPerimetro.jtf_baseTriangulo.setVisible(true);
            this.viewPerimetro.jtf_ladoCuadrado.setVisible(true);
             JOptionPane.showMessageDialog(null, "Area Triangulo isoscel es:" +Triangulo() +"Area recatangulo es:" +Rectangulo() 
                     +"Area del cuadrado es:"+Cuadrado());
        }
    }
    
}
