/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplopolimorfismo2;

import java.util.Random;

/**
 *
 * @author usuario12
 */
public abstract class NumeroAleatorio {
    private int minimo=0;
    private int maximo=0;
    
    public NumeroAleatorio(int minimo, int maximo){
        this.maximo=maximo;
        this.minimo=minimo;
    }
    
    public int generarNumero(){
    int numero=0;
    Random r= new Random();
    numero= r.nextInt((maximo - minimo)+1)+minimo;
    return numero;
    }
    public abstract void iniciar();
    public abstract void ejecutar();
}
