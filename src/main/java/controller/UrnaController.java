/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import viewUrnaEleitoral.ViewUrna;
import model.bean.Candidato;

/**
 *
 * @author batcomputador
 */
public class UrnaController {

    private final ViewUrna view;

    public UrnaController(ViewUrna view) {
        this.view = view;
    }
    
    
    
    public void painelNumerico(){
        
      String numero = view.getPainelNumerico().getText();
      
      //Candidato modelo = new Candidato(numero);




}
    
}


