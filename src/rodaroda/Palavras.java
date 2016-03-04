package rodaroda;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Kleudson Classe trata as palavras Sorteadas e confere cada caracter
 * para saber se o usuário acertou a letra ou não. Essa classe tem alguns
 * métodos de formatação de texto.
 */
public class Palavras {

    /**
     *
     * @param arrayPalavras
     * @param qtdePalavras
     * @return
     */
    public List<String> sortearPalavra(List<String> arrayPalavras, int qtdePalavras) {
        double numeroAleatorio;
        int numeroSorteado;
        List<String> listPalavraSorteada = new ArrayList<>();
        List<Integer> listNumeroSorteado = new ArrayList<>(qtdePalavras);

        while (qtdePalavras != 0) {

            numeroAleatorio = Math.random() * arrayPalavras.size();
            numeroAleatorio = Math.floor(numeroAleatorio);
            numeroSorteado = (int) numeroAleatorio;
            if (!listNumeroSorteado.contains(numeroSorteado)) {
                listNumeroSorteado.add(numeroSorteado);
                listPalavraSorteada.add(arrayPalavras.set(numeroSorteado, ""));
                qtdePalavras--;
            }
        }

        return listPalavraSorteada;
    }
/*    
 *    Método solicita a entrada de uma letra para comparar com a palavra que foi sorteada
 *    Também evita que o usuário digite caracteres incorretos
 */
    /**
     *
     * @return
     */
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


    /**
     *Métodos para limitar os caracteres aceitos
     * @param name
     * @return
     */
        public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z@]+");
    }


    /**
     *Métodos para limitar os caracteres aceitos
     * @param letra
     * @return
     */
    
    public boolean isAlphaVezDeJogar(String letra) {
        return letra.matches("[s,n,S,N]+");
    }



    /**
     *Métodos para limitar os caracteres aceitos
     * @param numero
     * @return
     */
    
    public boolean isNumero(String numero) {
        return numero.matches("[1-7]+");
    }

}
