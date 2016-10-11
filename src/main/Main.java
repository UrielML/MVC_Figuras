
package main;
import models.*;
import views.*;
import controllers.*;
import javax.swing.JPanel;
/**
 *
 */
public class Main {
    private static ViewMain viewMain;
    private static ModelMain modelMain;
    private static ControllerMain controllerMain;
    
    private static ViewPerimetro viewPerimetro;
    private static ModelPerimetro modelPerimetro;
    private static ControllerPerimetro controllerPerimetro;
    
    private static ViewArea viewArea;
    private static ModelArea modelArea;
    private static ControllerArea controllerArea;
    
    private static ViewVolumen viewVolumen;
    private static ModelVolumen modelVolumen;
    private static ControllerVolumen controllerVolumen;
    
    public static void main(String[] EJHR) {
       
       viewPerimetro = new ViewPerimetro();
       modelPerimetro = new ModelPerimetro();
       
       
       controllerPerimetro = new ControllerPerimetro(viewPerimetro, modelPerimetro);
       
       viewArea = new ViewArea();
       modelArea = new ModelArea();
      controllerArea = new ControllerArea(viewArea, modelArea);
      
      viewVolumen = new ViewVolumen();
      modelVolumen = new ModelVolumen();
      controllerVolumen = new ControllerVolumen(viewVolumen, modelVolumen);
       
        JPanel views[]=new JPanel[3];
      
        views[0]=viewArea;
        views[1]=viewPerimetro;
        views[2]=viewVolumen;
      
      
       viewMain = new ViewMain();
       modelMain = new ModelMain();
       controllerMain = new ControllerMain(viewMain,modelMain,views);
    }
    
    
}
