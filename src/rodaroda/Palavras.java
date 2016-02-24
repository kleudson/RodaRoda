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

    public String letrasPalavra() {
        String palavraString;
        boolean eAlpha = false;
        int tamanhoPalavra;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Digite somente uma letra");
            palavraString = sc.nextLine().toLowerCase();
            tamanhoPalavra = palavraString.length();
            eAlpha = isAlpha(palavraString);
            while (eAlpha == false) {
                System.out.println("Digite apenas uma letra. Outros caracteres serão ignorados.");
                palavraString = sc.nextLine().toLowerCase();
                tamanhoPalavra = palavraString.length();
                eAlpha = isAlpha(palavraString);
            }
        } while (tamanhoPalavra != 1);

        return palavraString;
    }

    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }
}
