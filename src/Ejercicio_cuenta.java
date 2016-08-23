/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.Scanner;



/**
 *
 * @author Estudiante
 */
public class Ejercicio_cuenta {
    private static Object java;
  
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta magdalena=
                new Cuenta(1012, "Magdalena s", 0, 1234);
        //Consiganando en cuenta
        magdalena.consignar(100000);
         Cuenta joselito=
            new Cuenta(1013,"Joselito P",500000,9876);
        System.out.println("Digite el nombre de su cuenta");
        Scanner teclado = new Scanner(System.in);
        String nCuenta;
        nCuenta= teclado.nextLine();
        System.out.println("Presione 1 si de sea conocer su saldo \n Presione 2 si de sea retirar saldo \n Presione 3 si de sea abonar saldo \n Presione 3 si de sea cambiar su clave \n Presione 5 si de sea finalizar");
        int i;
        i=teclado.nextInt();
        switch(i){
            case 1:
                System.out.println(nCuenta.salario);
                
            
        }
        
    }
   
   
    
    
}
