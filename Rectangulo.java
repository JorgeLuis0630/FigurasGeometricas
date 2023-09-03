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
public class Rectangulo {
    private int ladoA;
    private int ladoB;
    
    public Rectangulo()
    {
        this.ladoA=0;
        this.ladoB=0;
    }
    public Rectangulo(int ladoA,int ladoB)
    {
        this.ladoA=ladoA;
        this.ladoB=ladoB;
    }

    /**
     * @return the ladoA
     */
    public int getLadoA() {
        return ladoA;
    }

    /**
     * @param ladoA the ladoA to set
     */
    public void setLadoA(int ladoA) {
        this.ladoA = ladoA;
    }

    /**
     * @return the ladoB
     */
    public int getLadoB() {
        return ladoB;
    }

    /**
     * @param ladoB the ladoB to set
     */
    public void setLadoB(int ladoB) {
        this.ladoB = ladoB;
    }
    public int calcularAreaR()
    {
        return ladoA*ladoB;
    }
    public int calcularPeriR()
    {
        return (2*ladoA)+(2*ladoB);
    }
}
