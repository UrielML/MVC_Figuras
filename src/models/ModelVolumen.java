/*
 Implementacion del ModelVolumen
 */
package models;

/**
 *
 *
 */
public class ModelVolumen {
    private double resultado;
    private double areaBase;
    private double altura;
    private double radio;
    
    
    public void cono(){
        setResultado(((3.1416*(getRadio()*getRadio()))*getAltura())/3);
    }
    public void prisma(){
        setResultado(getAreaBase()*getAltura());
    }
    public void esfera(){
        setResultado((4/3)*(3.1416*getRadio()));
        
    }

    /**
     * @param resultado the resultado to set
     */
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public double getResultado() {
        return resultado;
    }

    /**
     * @return the areaBase
     */
    public double getAreaBase() {
        return areaBase;
    }

    /**
     * @param areaBase the areaBase to set
     */
    public void setAreaBase(double areaBase) {
        this.areaBase = areaBase;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }

    /**
     * @return the radio
     */
    public double getRadio() {
        return radio;
    }

    /**
     * @param radio the radio to set
     */
    public void setRadio(double radio) {
        this.radio = radio;
    }
    
}
