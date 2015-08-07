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
        
        System.out.println("******************************");
            //System.out.println(Traje);
        switch(Traje){
        //Aqui imprimimos el nombre de el tipo de carta
            case 1: System.out.println("La carta es el " +(carta-((Traje-1)*13)) +" de Treboles");
                break;
            case 2: System.out.println("La carta es el " +(carta-((Traje-1)*13)) +" de Diamantes");
                break;
            case 3: System.out.println("La carta es el " +(carta-((Traje-1)*13)) +" de Corazones");
                break; 
            case 4: System.out.println("La carta es el " +(carta-((Traje-1)*13)) +" de Espadas");
                break;
            default: System.out.println("Indefinido");
                break;
        }
        
//        System.out.println("Numero de la carta");
//            System.out.println(carta-((Traje-1)*13));
        
        System.out.println("Secuencia en el mazo de cartas: "+(carta));
        }
    @Override 
    public void iniciar(){
        System.out.println("Presione enter para mostrar una carta de la baraja");
        Scanner s = new Scanner(System.in);
            s.nextLine();
    }
    
}
