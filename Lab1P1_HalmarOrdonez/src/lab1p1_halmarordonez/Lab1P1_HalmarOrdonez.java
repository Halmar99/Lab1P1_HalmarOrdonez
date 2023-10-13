
package lab1p1_halmarordonez;

import java.util.Scanner;


public class Lab1P1_HalmarOrdonez {


    public static void main(String[] args) {
        
        Scanner read = new Scanner(System.in);
                
        int num = 0;
        char character = 'a';
        double doble = 1.25;
        boolean VoF = true;
        
        System.out.println("Elija el ejercicio: ");
        num = read.nextInt();
        
        if (num == 1){
            int num1 = 15;
            int num2 = 30;
            int resultado;
            resultado = 15*30;
            System.out.print("Resultado: ");
            System.out.println(resultado);
            
        }else if(num == 2){
            System.out.println("Ingrese un numero entero: ");
            int numeroUsuario = read.nextInt();
            System.out.println("Ingrese un numero entero: ");
            int numeroUsuario2 = read.nextInt();
            System.out.println("Ingrese un numero entero: ");
            int numeroUsuario3 = read.nextInt();
            
            double promedio = (numeroUsuario+numeroUsuario2+numeroUsuario3)/3;
            
            System.out.println("Promedio: " + promedio);
            
        }else{
            System.out.println("Salio del programa.");
        }
    
    }
}
