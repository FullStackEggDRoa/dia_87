/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicio_5;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author droa
 */
public class Ejercicio_5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int numeroAleatorio=(int) ((Math.random()*499)+1);
        int numeroIngresado = 0;
        int contadorIntentos = 0;
                
        do{
            
            Scanner leer = new Scanner(System.in).useDelimiter("\n");
            System.out.print("Adivina el número. Rango[1-500] | 0 - Salir: ");
            try{
                numeroIngresado = leer.nextInt();
                if(numeroIngresado>numeroAleatorio){
                    contadorIntentos++;
                    System.out.println("El número Ingresado es Mayor al que debes adivinar.");
                    System.out.println("Intenta nuevamente.. Intento: "+contadorIntentos+" :)");
                }else if(numeroIngresado<numeroAleatorio){
                    contadorIntentos++;
                    System.out.println("El número Ingresado es Menor al que debes adivinar.");
                    System.out.println("Intenta nuevamente.. Intento: "+contadorIntentos+" :)");
                    
                }else{
                    System.out.println("Caray.. Lo Hiciste!!!! al Intento No.: "+contadorIntentos);
                    System.out.println("Deseas Jugar otra vez ? [Si | No]");
                    try{
                        String respuesta = leer.next();
                        if(respuesta.equalsIgnoreCase("si")){
                            numeroAleatorio=(int) ((Math.random()*499)+1);
                        }else if(respuesta.equalsIgnoreCase("no")){
                            System.out.println("Oh. Que pena. Hasta la Próxima.");
                        }else{
                            System.out.println("Gracias por Jugar. No entendí tu respuesta. Hasta otra oportunidad. ");
                            numeroIngresado=0;
                            leer.close();
                        }
                        
                    }catch(InputMismatchException e){
                        System.out.println("Gracias por Jugar. No entendí tu respuesta. Hasta otra oportunidad. ");
                        numeroIngresado=0;
                        leer.close();
                    }
                }
                
            } catch (InputMismatchException e){
                contadorIntentos++;
                System.out.println("NOTA: El valor ingresado no es un número.");
                System.out.println("Intenta nuevamente.. Intento: "+contadorIntentos+" :(");
                numeroIngresado=-1;                
                leer.next();
                //leer.close();
            } catch (NumberFormatException e){
                contadorIntentos++;
                System.out.println("NOTA: El valor ingresado no es entero.");
                System.out.println("Intenta nuevamente.. Intento: "+contadorIntentos+" :(");
                numeroIngresado=-1;
                 leer.next();
                //leer.close();
            } catch (Exception e){
                System.out.println(e.toString());
                 numeroIngresado=0;
                leer.next();
                //leer.close();
               
            } 
            
        }while(numeroIngresado != 0);
        
    }
    
}
