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
    
        String tema = "animais";
        String palavra = "cachorro"; 
    
    void Menu() {
	System.out.println("M E N U - RODA A RODA - PDS\n");
	System.out.println("1 - Para informar uma letra\n");
	System.out.println("2 - Para tentar adivinhar a palavra\n");
	System.out.println("3 - Sair do jogo\n");
     }
    
    void Sorte() {
        {
            Scanner sc = new Scanner(System.in);
            char letra = ' ';
                System.out.println("***** SORTE!!! ****");
                System.out.println("Para informar uma letra, digite '1' ou digite '2' para tentar adivinhar a palavra");
                System.out.println("Por favor, escolha uma letra");
                letra = sc.nextLine().charAt(0);
                System.out.println("");
                //totalPontos = totalPontos + Integer.parseInt(sorteado);
                for (int i = 0; i < palavra.length(); i++) {
                    if (palavra.charAt(i) == letra) {
                        System.out.print(letra);
                    } else {
                        System.out.print(" __ ");
                    }
                }
            }
    }
    
   public void Escolha() {
//        int opcao;
//        do { Menu();
//        Scanner sc = new Scanner(System.in);
//	   opcao = sc.nextInt();
//	   switch (opcao) {
//		  case 1:Sorte();
//	             break;
//		  case 2:Sorte();
//		         break;
//		  case 3:Sorte();
//		         break;
//		  default : System.out.println("Opção não existente\n");
//		         break;
//		   }
//
//  }while(opcao!=3);
    }

    
    public static void main(String[] args) {
        String sorteado;
        String nomeUm = "";
        String nomeDois = "";
        String nomeTres = "";
        String nomeJogadores[];
        int qtdeJogadores, qtdeEtapas, qtdePalavras;
        int totalTentativas = 3; 
        int totalPontos = 0;
        Scanner sc = new Scanner(System.in);
        Roleta umaRoleta = new Roleta();
        Parametros parametros = new Parametros();
        
        umaRoleta.letrasPalavra();

        qtdeJogadores = parametros.qtdeJogadores();
        qtdeEtapas = parametros.qtdEtapas();
        qtdePalavras = parametros.qtdePalavras();
        
        nomeJogadores = parametros.Jogadores(qtdeJogadores);
        
        for (int i = 0; i < nomeJogadores.length; i++){ //Recuperando nome jogadores do Array
            if (qtdeJogadores == 1) {
                nomeUm = nomeJogadores[i];
                Jogadores jogador1 = new Jogadores(nomeUm, totalPontos, totalTentativas);
            } else if (qtdeJogadores == 2) {
                nomeUm = nomeJogadores[i];
                Jogadores jogador1 = new Jogadores(nomeUm, totalPontos, totalTentativas);
                Jogadores jogado2 = new Jogadores(nomeDois, totalPontos, totalTentativas);
                i++;
                nomeDois = nomeJogadores[i];
            } else {
                nomeUm = nomeJogadores[i];
                i++;
                nomeDois = nomeJogadores[i];
                i++;
                nomeTres = nomeJogadores[i];
                Jogadores jogador1 = new Jogadores(nomeUm, totalPontos, totalTentativas);
                Jogadores jogado2 = new Jogadores(nomeDois, totalPontos, totalTentativas);
                Jogadores jogador3 = new Jogadores(nomeTres, totalPontos, totalTentativas);
            }
        }
        
         System.out.println("Quantidade de jogadores escolhida é: " + qtdeJogadores);
         System.out.println("Quantidade de etapas escolhida é: " + qtdeEtapas);
         System.out.println("Quantidade de palavras escolhida é: " + qtdePalavras);
         System.out.println("O tema escolhida é: " + qtdeJogadores);
//        String tema = "animais";
//        String palavra = "cachorro";

//        System.out.println("O tema Sorteado foi: " + tema);

        while (totalTentativas > 0) {

//            char letra = ' ';

            sorteado = umaRoleta.sortear();
            System.out.println("Foi Sorteado: " + sorteado);
            
             if (("Perde Tudo".equals(sorteado)) || ("Passa a Vez".equals(sorteado))){
                 
             } else {
                 totalPontos = totalPontos + Integer.parseInt(sorteado);
                 System.out.println("Total é: " + totalPontos);
                 System.out.println("");
             }
            
            if (sorteado == "Perde Tudo") {
                totalTentativas--;
                totalPontos = 0;
                System.out.println("Que Azar Heim, PERDEU TUDO!!!!!!");
                System.out.println("Mas não se preocupe, você ainda tem " + totalTentativas + " tentativas.");
            } else if (sorteado == "Passa a Vez") {
                totalTentativas--;
                System.out.println("Que Azar Heim, PASSOU A VEZ!!!");
                System.out.println("Mas não se preocupe, você ainda tem " + totalTentativas + " tentativas.");
              } else {
//                System.out.println("***** SORTE!!! ****");
//                System.out.println("Para informar uma letra, digite '1' ou digite '2' para tentar adivinhar a palavra");
//                System.out.println("Por favor, escolha uma letra");
//                letra = sc.nextLine().charAt(0);
//                System.out.println("");
//                //totalPontos = totalPontos + Integer.parseInt(sorteado);
//                for (int i = 0; i < palavra.length(); i++) {
//                    if (palavra.charAt(i) == letra) {
//                        System.out.print(letra);
//                    } else {
//                        System.out.print(" __ ");
//                    }
//                }
            }

            System.out.println("");
            System.out.println("Sua pontuação atual é: " + totalPontos);
        }
        System.out.println("");
        System.out.println("FIM DE JOGO ");
        System.out.println("");
    }

}
