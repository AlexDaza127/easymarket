/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author Michael
 */
public class ListaMercado {

    ArrayList<Supermercado> ListaProductos;

    public ListaMercado(ArrayList<Supermercado> Supermercado) {
        this.ListaProductos = Supermercado;
    }

    
    public ArrayList<Supermercado> getSupermercado() {
        return ListaProductos;
    }

    public void setSupermercado(ArrayList<Supermercado> Supermercado) {
        this.ListaProductos = Supermercado;
    }

    @Override
    public String toString() {
        String datos = "";
        for (int i = 0; i < ListaProductos.size(); i++) {
            datos += ListaProductos.get(i).toString() + "\n";
        }
        return datos;
    }
}
