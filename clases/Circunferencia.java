/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Jorge Luis
 */
public class Circunferencia {
    private double radio;
    
    public Circunferencia()
    {
        this.radio=0;
    }
    public Circunferencia(double radio)
    {
        this.radio=radio;    
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
    
    public double calcularAreaC()
    {
        double pi=3.1416;
        double area;
        area=pi*(radio*radio);
        return area;
    }
    public double calcularPeriC()
    {
        double pi=3.1416;
        return 2*pi*radio;
    }
}
