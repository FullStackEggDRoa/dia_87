/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_4;

import Entidades.DivisionNumero;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        DivisionNumero operacion1=new DivisionNumero();
        
        try{
            System.out.print("Ingrese el valor del Número 1: ");
            int num1 = leer.nextInt();
            System.out.print("Ingrese el valor del Número 2: ");
            String num2 = leer.next();

            String auxNum1 = Integer.toString(num1);

            operacion1.setNum1(Integer.parseInt(auxNum1));
            operacion1.setNum2(Integer.parseInt(num2));

            System.out.println("La División de los números ingresados es: " + (operacion1.getNum1() / operacion1.getNum2()));
            
        }catch (InputMismatchException mM){
            System.out.println("NOTA: El valor ingresado no es un número. Pruebe nuevamente. Por lo que: "+mM.getCause());
        }catch (NumberFormatException nF){
            System.out.println("NOTA: El Número ingresado no es entero. Por lo que: "+nF.getCause());
        }catch (ArithmeticException aE){
            System.out.println("NOTA: Se ha efectuado una División para Cero.");
        }
    }
    
}
