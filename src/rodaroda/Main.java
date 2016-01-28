/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda;

import java.util.Scanner;

/**
 *
 * @author Kleudson
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String sorteado;
        String jogadorUm, jogadorDois, jogadorTres;
        int numeroJogadores;
        Scanner sc = new Scanner(System.in);
        Roleta umaRoleta = new Roleta();

        numeroJogadores = umaRoleta.qtdeJogadores();

        for (int i = 0; i < numeroJogadores; i++) {
            if (numeroJogadores == 1) {
                System.out.println("Informe o nome do jogador " + (i + 1) + ":");
                jogadorUm = sc.nextLine();
            } else if (numeroJogadores == 2) {
                System.out.println("Informe o nome do jogador " + (i + 1) + ":");
                jogadorUm = sc.nextLine();
                i++;

                System.out.println("Informe o nome do jogador " + (i + 1) + ":");
                jogadorDois = sc.nextLine();
                i++;

            } else if (numeroJogadores == 3) {
                System.out.println("Informe o nome do jogador " + (i + 1) + ":");
                jogadorUm = sc.nextLine();
                i++;

                System.out.println("Informe o nome do jogador " + (i + 1) + ":");
                jogadorDois = sc.nextLine();
                i++;

                System.out.println("Informe o nome do jogador " + (i + 1) + ":");
                jogadorTres = sc.nextLine();
                i++;
            }
        }

        System.out.println("Quantidade de jogadores escolhida é: " + numeroJogadores);
        String tema = "animais";
        String palavra = "cachorro";

        System.out.println("O tema Sorteado foi: " + tema);

        int contador = 3;
        int totalPontos = 0;

        while (contador > 0) {

            char letra = ' ';

            sorteado = umaRoleta.sortear();
            System.out.println("Foi Sorteado: " + sorteado);
            System.out.println("");
            
            if (sorteado == "Perde Tudo") {
                contador--;
                totalPontos = 0;
                System.out.println("Que Azar Heim, PERDEU TUDO!!!!!!");
                System.out.println("Mas não se preocupe, você ainda tem " + contador + " tentativas.");
            } else if (sorteado == "Passa a Vez") {
                contador--;
                System.out.println("Que Azar Heim, PASSOU A VEZ!!!");
                System.out.println("Mas não se preocupe, você ainda tem " + contador + " tentativas.");
            } else {
                System.out.println("Por favor, escolha uma letra");
                letra = sc.nextLine().charAt(0);
                System.out.println("");
                totalPontos = totalPontos + Integer.parseInt(sorteado);
                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == letra) {
                        System.out.print(letra);
                    } else {
                        System.out.print(" __ ");
                    }
                }
            }

            System.out.println("");
            System.out.println("Sua pontuação total é: " + totalPontos);
        }
        System.out.println("");
        System.out.println("FIM DE JOGO ");
        System.out.println("");
    }

}
