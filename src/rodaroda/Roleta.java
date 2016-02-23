/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor. 
 */
package rodaroda;

import java.util.Scanner;

/**

 * @author Kleudson e Wallace
 
 */


public class Roleta {   
    
    
    public void compararLetras(char letraInformada, String palavraSorteada) {
        int tamanhoPalavra = palavraSorteada.length();
        int letraErrada = 0;
        String  palavraFormada = "";
        char letrasCertas[] = new char [tamanhoPalavra];
        char[] letrasPalavraSorteada = new char[tamanhoPalavra];
        
        for (int i = 0; i < tamanhoPalavra; i++) {
            letrasPalavraSorteada[i] = palavraSorteada.charAt(i);
        }
        
            for (int x = 0; x < tamanhoPalavra; x++){
                if (letraInformada == letrasPalavraSorteada[x]){
                    letrasCertas[x] = letraInformada;
                } else {
                    letraErrada++;
                }
                
                if (letrasCertas[x] == letrasPalavraSorteada[x]){
                    palavraFormada = palavraFormada + letrasCertas[x];
                    System.out.print("  "+letrasCertas[x]+"  ");
                } else {
                    System.out.print(" __ ");
                }
            }
            
            if (letraErrada >= tamanhoPalavra){
                System.out.println("Não existe essa letra na palavra!");
            }
            
            if (palavraFormada.equals(palavraSorteada)){
                System.out.println("**************************************************************");
                System.out.println("************* PARABÉNS, VOCÊ ACERTOU A PALAVRA!! *************");
                System.out.println("**************************************************************");
            }
    }

    public String sortear() {

        double numero_aleatorio;
        int numeroSorteado;

        numero_aleatorio = Math.random() * 20;
        numero_aleatorio = Math.floor(numero_aleatorio);
        numeroSorteado = (int) numero_aleatorio;

        String perdeTudo = "Perde Tudo";
        String passaVez = "Passa a Vez";
        String cem = "100";
        String duzentos = "200";
        String quatrocentos = "400";
        String quinhentos = "500";
        String mil = "1000";

        if ((numeroSorteado >= 0) && (numeroSorteado <= 1)) {
            return perdeTudo;
        } else if ((numeroSorteado >= 2) && (numeroSorteado <= 3)) {
            return passaVez;
        } else if ((numeroSorteado >= 4) && (numeroSorteado <= 7)) {
            return cem;
        } else if ((numeroSorteado >= 8) && (numeroSorteado <= 11)) {
            return duzentos;
        } else if ((numeroSorteado >= 12) && (numeroSorteado <= 15)) {
            return quatrocentos;
        } else if ((numeroSorteado >= 16) && (numeroSorteado <= 17)) {
            return quinhentos;
        } else if ((numeroSorteado >= 18) && (numeroSorteado <= 19)) {
            return mil;
        } else {
            return sortear();
        }
    }
}
