/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ejemplopolimorfismo2;

import java.util.Scanner;

/**
 *
 * @author usuario12
 */
public class Baraja  extends NumeroAleatorio{
    private int Traje=0;
    public Baraja(){
    super(1,52);
    }
    @Override 
    public void ejecutar(){
     int carta=super.generarNumero(); 
       //Aqui se evalua el modulo para saber si redondear hacia abajo o arriba
        if(carta % 13 > 0){
               Traje= (int)Math.floor(carta/13)+1;
            }else {
               Traje=(carta/13);
            } 
        
        System.out.println("Traje");
            System.out.println(Traje);
        
        System.out.println("Numero de las cartas");
            System.out.println(carta-((Traje-1)*13));
        
        System.out.println("Secuencia completa de las cartas");
            System.out.println(carta);
        }
    @Override 
    public void iniciar(){
        System.out.println("Presione enter para mostrar una carta de la baraja");
        Scanner s = new Scanner(System.in);
            s.nextLine();
    }
    
}
