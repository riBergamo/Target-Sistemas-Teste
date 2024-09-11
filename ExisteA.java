import java.util.*;
import java.lang.*;
import java.io.*;

class ExisteA {
    public static void main(String[] args) {
        //2) Existência da letra ‘a’, maiúscula ou minúscula, quantidade de vezes em que ela ocorre. 
        String palavra = "Amar";
        char letra = 'a';
        int quantVezes = 0;

        String palavraMinuscula = palavra.toLowerCase();
        char letraMinuscula = Character.toLowerCase(letra);
        
        for (int i = 0; i < palavraMinuscula.length(); i++) {
            if (palavraMinuscula.charAt(i) == letraMinuscula) {
                quantVezes++;
            }
        }

        if (quantVezes > 0) {
            System.out.println("A letra '" + letra + "' existe na palavra " + palavra + " e aparece " + quantVezes + " vezes.");
        } else {
            System.out.println("A letra '" + letra + "' não existe na palavra."); 
        }
    }
}
