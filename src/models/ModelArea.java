/*
Implementacion del modelo Area
 */
package models;

/**
 *
 * 
 */
public class ModelArea {
    private double resultadoa;
    private double altura;
    private double radio;
    
    
    public void cilindro(){
        setResultadoa(((2*3.1416) * getRadio()) * (getAltura() + getRadio()));
    }
    public void cubo(){
        double areaCara = getAltura()*getAltura();
        setResultadoa(6*(areaCara*areaCara));
    }
    public void esfera(){
        setResultadoa((4*3.1416) * (getRadio() * getRadio()));
        
    }

    /**
     * @return the resultadoa
     */
    public double getResultadoa() {
        return resultadoa;
    }

    /**
     * @param resultadoa the resultadoa to set
     */
    public void setResultadoa(double resultadoa) {
        this.resultadoa = resultadoa;
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
