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
public class Moneda extends NumeroAleatorio{
    private String cara1="";
    private String cara2="";
    
    public Moneda(String cara1,String cara2){
        super(1,2);
        this.cara1=cara1;
        this.cara2= cara2;
    }
    @Override
    public void iniciar(){
        System.out.println("Presiones enter para girar la moneda");
        Scanner s = new Scanner(System.in);
        s.nextLine();
    }
    @Override
    public void ejecutar(){
    int numero= super.generarNumero();
    if (numero==1){
    System.out.printf("Resultado:%s%n",cara1);
    }
    else{System.out.printf("Resultado:%s%n",cara2);
            }
    }


}
