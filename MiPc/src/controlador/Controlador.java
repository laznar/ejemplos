/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import modelo.Equipo;
import modelo.MiPc;
import modelo.Portatil;
import modelo.Procesador;


/**
 *
 * @author augustosalazar
 */
public class Controlador {
    
    private MiPc miPc;

    public Controlador(MiPc miPc) {
        this.miPc = miPc; 
    }

    public void agregarPB(int idBodega, String serialPortaril, String serialProcesador, float peso) {
        Portatil p = new Portatil(new Procesador(serialProcesador), serialPortaril, peso);
        miPc.agregarPortatil(miPc.getBodega(idBodega), p);
    }
    
     public Equipo encontrarSerial(String serial){
         return miPc.encontrarSerial(serial);
     }
}
