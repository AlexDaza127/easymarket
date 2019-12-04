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
public class Persona {
    private String Nom;
    private int Id;
    private int Tel;
    private double Max;

    public Persona(String Nom, int Id, int Tel, double Max) {
        this.Nom = Nom;
        this.Id = Id;
        this.Tel = Tel;
        this.Max = Max;
    }
    
    public Persona() {
        this.Nom = "";
        this.Id = 0;
        this.Tel = 0;
        this.Max = 0;
    }

    public String getNom() {
        return Nom;
    }

    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public int getTel() {
        return Tel;
    }

    public void setTel(int Tel) {
        this.Tel = Tel;
    }

    public double getMax() {
        return Max;
    }

    public void setMax(double Max) {
        this.Max = Max;
    }

    @Override
    public String toString() {
        return "Persona{" + "Nom=" + Nom + ", Id=" + Id + ", Tel=" + Tel + ", Max=" + Max + '}';
    }
    
    
}
