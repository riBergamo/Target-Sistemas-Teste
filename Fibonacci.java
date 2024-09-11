import java.util.*;
import java.lang.*;
import java.io.*;

class Fibonacci {
    public static void main(String[] args) {
        //1) Fibonacci 
        Scanner scanner = new Scanner(System.in);
    
        int numeroDesejado = 0;
        int A = 0;
        int B = 1;
        int C;
        boolean pertence = false;

        System.out.println("Digite o número desejado: ");
        numeroDesejado = scanner.nextInt();

        while (numeroDesejado >= B) {
            System.out.println(B);
            if (numeroDesejado == B) {
                pertence = true;
                break;
            }            
            C = B;
            B += A;
            A = C;
        } 

        if (pertence) {
            System.out.println(numeroDesejado + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numeroDesejado + " não pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }
}

