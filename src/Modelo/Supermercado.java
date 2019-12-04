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
public abstract class Supermercado {
    private String nomSup;
    private String tipoProd;
    private int cant;
    Persona objP;
    Fecha objF;

    public Supermercado(String nomSup, String tipoProd, int cant, Persona objP, Fecha objF) {
        this.nomSup = nomSup;
        this.tipoProd = tipoProd;
        this.cant = cant;
        this.objP = objP;
        this.objF = objF;
    }
    
    public Supermercado() {
        this.nomSup = "";
        this.tipoProd = "";
        this.cant = 0;
        this.objP = new Persona();
        this.objF = new Fecha();
    }

    public String getNomSup() {
        return nomSup;
    }

    public void setNomSup(String nomSup) {
        this.nomSup = nomSup;
    }

    public String getTipoProd() {
        return tipoProd;
    }

    public void setTipoProd(String tipoProd) {
        this.tipoProd = tipoProd;
    }

    public int getCant() {
        return cant;
    }

    public void setCant(int cant) {
        this.cant = cant;
    }

    public Persona getObjP() {
        return objP;
    }

    public void setObjP(Persona objP) {
        this.objP = objP;
    }

    public Fecha getObjF() {
        return objF;
    }

    public void setObjF(Fecha objF) {
        this.objF = objF;
    }
    
    
    public abstract double descuento();
}
