/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Modelo.ListaMercado;
import Modelo.ReciboPDF;
import Vista.VentPrincipal;
import Vista.frmPersona;
import Vista.frmProdComprados;
import Vista.frmSupermercados;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Michael
 */
public class Controlador implements ActionListener{

    VentPrincipal VentPrinc;
    frmPersona frmP;
    frmProdComprados frmPC;
    frmSupermercados frmSm;
    ReciboPDF objPDF;
    ListaMercado objListaM;

    
    public void iniciar(){
        VentPrinc.setVisible(true);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
