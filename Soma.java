import java.util.*;
import java.lang.*;
import java.io.*;

class Soma {
    public static void main(String[] args) {
        //3)int INDICE = 12, SOMA = 0, K = 1; 
        //    enquanto K < INDICE faça { 
        //    K = K + 1; SOMA = SOMA + K; 
        //    } 
        //    imprimir(SOMA);
        //Ao final do processamento, qual será o valor da variável SOMA?

        int indice = 12;
        int soma = 0;
        int k = 1;

        while (k < indice) {
            k += 1;
            soma += k;           
            
        }
        System.out.println("A variável soma ao final do processamento terá o valor de " + soma);
    }
}
