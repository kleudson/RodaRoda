/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kleudson
 */
public class Palavras {

    public String sortearPalavra(List<String> arrayPalavras) {
        String palavraSorteada = "";
        double numeroAleatorio;
        int numeroSorteado;

        numeroAleatorio = Math.random() * arrayPalavras.size();
        numeroAleatorio = Math.floor(numeroAleatorio);
        numeroSorteado = (int) numeroAleatorio;

        palavraSorteada = arrayPalavras.set(numeroSorteado, "");

        return palavraSorteada;
    }

    public char[] letrasPalavra() {
        char[] vetorLetraDigitada;
        char[] vetorPalavraDigitada;
        String letraDigitada;
        String palavraDigitada;
        boolean eAlpha = false;
        int tamanhoPalavra;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite somente uma letra ou digite '@' para informar a palavra!");
            letraDigitada = sc.nextLine().toLowerCase();
            tamanhoPalavra = letraDigitada.length();

            if (letraDigitada.equals("@")) {
                System.out.println("Digite a palavra completa.");
                palavraDigitada = sc.nextLine();
                tamanhoPalavra = palavraDigitada.length();
                vetorPalavraDigitada = new char[tamanhoPalavra];
                for (int i = 0; i < palavraDigitada.length(); i++) {
                    vetorPalavraDigitada[i] = palavraDigitada.charAt(i);
                }

                return vetorPalavraDigitada;
            }

            tamanhoPalavra = letraDigitada.length();
            eAlpha = isAlpha(letraDigitada);
            while (eAlpha == false) {
                System.out.println("Digite apenas uma letra ou digite '@' para informar a palavra! \n"
                        + "Outros caracteres serão ignorados.");
                letraDigitada = sc.nextLine().toLowerCase();
                tamanhoPalavra = letraDigitada.length();
                vetorLetraDigitada = new char[tamanhoPalavra];
                eAlpha = isAlpha(letraDigitada);

                for (int x = 0; x < letraDigitada.length(); x++) {
                    vetorLetraDigitada[x] = letraDigitada.charAt(x);
                }

            }
        } while (tamanhoPalavra != 1);
        
        vetorLetraDigitada = new char[tamanhoPalavra];
        for (int y = 0; y < letraDigitada.length(); y++) {
            vetorLetraDigitada[y] = letraDigitada.charAt(y);
        }
        
        return vetorLetraDigitada;
    }

    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z@]+");
    }
    
    public boolean isAlphaVezDeJogar(String letra) {
        return letra.matches("[s,n,S,N]+");
    }
    
    public boolean isNumero(String numero) {
        return numero.matches("[0-9]+");
    }
}
