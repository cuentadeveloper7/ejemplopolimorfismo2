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
public class Dado extends NumeroAleatorio {
    public Dado(){
    super(1,6);
    }
    //@Override
    public void iniciar(){
    Scanner s= new Scanner(System.in);
    System.out.println("Presione Enter para Girar el Dado");
    s.nextLine();
    }
    public void ejecutar(){
    int numero=super.generarNumero();
    System.out.printf("Resultado de girar el dado: %d%n",numero);
    } 
}
