/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author Michael
 */
public class Fecha {
    private int HH;
    private int mm;
    private int ss;

    public Fecha(int HH, int mm, int ss) {
        this.HH = HH;
        this.mm = mm;
        this.ss = ss;
    }
    
    public Fecha() {
        this.HH = 0;
        this.mm = 0;
        this.ss = 0;
    }

    public int getHH() {
        return HH;
    }

    public void setHH(int HH) {
        this.HH = HH;
    }

    public int getMm() {
        return mm;
    }

    public void setMm(int mm) {
        this.mm = mm;
    }

    public int getSs() {
        return ss;
    }

    public void setSs(int ss) {
        this.ss = ss;
    }
    
    
}
