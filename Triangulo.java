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
public class Triangulo {
    private int ladoA;
    private int ladoB;
    private int ladoC;
    private int base;
    private int altura;
    
    public Triangulo()
    {
        this.ladoA=0;
        this.ladoB=0;
        this.ladoC=0;
        this.base=0;
        this.altura=0;
    }
    public Triangulo(int ladoA,int ladoB,int ladoC,int base,int altura)
    {
        this.ladoA=ladoA;
        this.ladoB=ladoB;
        this.ladoC=ladoC;
        this.base=base;
        this.altura=altura;
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

    /**
     * @return the ladoC
     */
    public int getLadoC() {
        return ladoC;
    }

    /**
     * @param ladoC the ladoC to set
     */
    public void setLadoC(int ladoC) {
        this.ladoC = ladoC;
    }

    /**
     * @return the base
     */
    public int getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(int base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }
    public int calcularAreaT()
    {
        return base*altura;
    }
    public int calcularPerimetroT()
    {
        return ladoA+ladoB+ladoC;
    }
}
