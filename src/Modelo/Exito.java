/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Random;

/**
 *
 * @author Michael
 */
public class Exito extends Supermercado {

    private double desc;
    Random ran = new Random();
    int N = ran.nextInt(20);

    public Exito(double desc, String nomSup, String tipoProd, int cant, Persona objP, Fecha objF) {
        super(nomSup, tipoProd, cant, objP, objF);
        this.desc = desc;
    }

    public Exito() {
        this.desc = 0;
    }

    
    @Override
    public String toString() {
        return "Cafam{" + "desc=" + desc + ", ran=" + ran + ", N=" + N + '}';
    }

    /**
     *
     * @return
     */
    @Override
    public double descuento() {
        return desc = N / 100;
    }

}
