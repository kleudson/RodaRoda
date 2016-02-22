/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rodaroda;

import java.util.Iterator;
import java.util.List;
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
        String sorteioRoleta;
        String nomeUm;
        String nomeDois;
        String nomeTres;
        String tema;
        String palavraSorteada;
        String letra;
        String[] vetorNomeJogadores;
        List<String> listPalavras = null;
        List<String> listLetrasJaSorteadas = null;
        int qtdeJogadores, qtdeEtapas, qtdePalavras;
        int totalTentativas = 3;
        int totalPontos = 0;
        int intem = 0;
        Scanner sc = new Scanner(System.in);
        Roleta roleta = new Roleta();
        Parametros parametros = new Parametros();

        qtdeJogadores = parametros.qtdeJogadores();
        qtdeEtapas = parametros.qtdEtapas();
        qtdePalavras = parametros.qtdePalavras();
        tema = parametros.sortearTema();
        
        listPalavras = parametros.escolheArquivoTxt(tema);
        
        palavraSorteada = parametros.sortearPalavra(listPalavras);        

        vetorNomeJogadores = parametros.Jogadores(qtdeJogadores);
        
        System.out.println("");
        System.out.println("Quantidade de jogadores escolhida é: " + qtdeJogadores);
        System.out.println("Quantidade de etapas escolhida é: " + qtdeEtapas);
        System.out.println("Quantidade de palavras escolhida é: " + qtdePalavras);
        System.out.println("O tema escolhido aleatóriamente foi: " + tema);
        System.out.println("");
        
        

        for (int i = 0; i < vetorNomeJogadores.length; i++) { //Recuperando nome jogadores do Array
            if (qtdeJogadores == 1) {
                nomeUm = vetorNomeJogadores[i];
                Jogadores jogador1 = new Jogadores(nomeUm, totalPontos, totalTentativas);

                System.out.println("########## JOGADOR 01 ##########");
                System.out.println("Nome: " + jogador1.getNome());
                System.out.println("Tentativas: " + jogador1.getTentativas());
                System.out.println("Total de Pontos: " + jogador1.getTotalPontos());

                while (jogador1.getTentativas() > 0) {

                    sorteioRoleta = roleta.sortear();
                    System.out.println("");
                    System.out.println("Foi Sorteado: " + sorteioRoleta);

                    if (sorteioRoleta.equals("Perde Tudo")) {
                        jogador1.setTentativas(jogador1.getTentativas() - 1);
                        jogador1.setTotalPontos(0);

                        if (jogador1.getTentativas() < 1) {
                            System.out.println("Que Azar Heim, PERDEU TUDO!!!!!!");
                        } else {
                            System.out.println("Que Azar Heim, PERDEU TUDO!!!!!!");
                            System.out.println("Mas não se preocupe, você ainda tem " + jogador1.getTentativas() + " tentativa(s).");
                        }
                    } else if (sorteioRoleta.equals("Passa a Vez")) {
                        jogador1.setTentativas(jogador1.getTentativas() - 1);

                        if (jogador1.getTentativas() < 1) {
                            System.out.println("Que Azar Heim, PASSOU A VEZ!!!");
                        } else {
                            System.out.println("Que Azar Heim, PASSOU A VEZ!!!");
                            System.out.println("Mas não se preocupe, você ainda tem " + jogador1.getTentativas() + " tentativa(s).");
                        }
//                    } else {
//                                               
//                        System.out.println("Você tem direito de escolher uma letra.");
//                        if (listLetrasJaSorteadas.isEmpty()){                          
//                            
//                        } else {
//                            for (Iterator<String> it = listLetrasJaSorteadas.iterator(); it.hasNext();) {
//                                String letra = it.next();
//                            }
//{
//                            
//                        }                     
//                                
//                                }
//                        letra = parametros.letrasPalavra();
//                        listLetrasJaSorteadas.add(letra);
//                        System.out.println("");
                        
                        jogador1.setTotalPontos(jogador1.getTotalPontos() + Integer.parseInt(sorteioRoleta));
                        System.out.println("");
                    }

                    System.out.println("A pontuação atual do(a) " + jogador1.getNome() + " é: " + jogador1.getTotalPontos());
                }

            } else if (qtdeJogadores == 2) {
                nomeUm = vetorNomeJogadores[i];
                i++;
                nomeDois = vetorNomeJogadores[i];

                Jogadores jogador1 = new Jogadores(nomeUm, totalPontos, totalTentativas);
                Jogadores jogador2 = new Jogadores(nomeDois, totalPontos, totalTentativas);

                System.out.println("");
                System.out.println("########## JOGADOR 01 ##########");
                System.out.println("Nome: " + jogador1.getNome());
                System.out.println("Tentativas: " + jogador1.getTentativas());
                System.out.println("Total de Pontos: " + jogador1.getTotalPontos());

                System.out.println("");
                System.out.println("########## JOGADOR 02 ##########");
                System.out.println("Nome: " + jogador2.getNome());
                System.out.println("Tentativas: " + jogador2.getTentativas());
                System.out.println("Total de Pontos: " + jogador2.getTotalPontos());
            } else {
                nomeUm = vetorNomeJogadores[i];
                i++;
                nomeDois = vetorNomeJogadores[i];
                i++;
                nomeTres = vetorNomeJogadores[i];

                Jogadores jogador1 = new Jogadores(nomeUm, totalPontos, totalTentativas);
                Jogadores jogador2 = new Jogadores(nomeDois, totalPontos, totalTentativas);
                Jogadores jogador3 = new Jogadores(nomeTres, totalPontos, totalTentativas);

                System.out.println("");
                System.out.println("########## JOGADOR 01 ##########");
                System.out.println("Nome: " + jogador1.getNome());
                System.out.println("Tentativas: " + jogador1.getTentativas());
                System.out.println("Total de Pontos: " + jogador1.getTotalPontos());

                System.out.println("");
                System.out.println("########## JOGADOR 02 ##########");
                System.out.println("Nome: " + jogador2.getNome());
                System.out.println("Tentativas: " + jogador2.getTentativas());
                System.out.println("Total de Pontos: " + jogador2.getTotalPontos());

                System.out.println("");
                System.out.println("########## JOGADOR 03 ##########");
                System.out.println("Nome: " + jogador3.getNome());
                System.out.println("Tentativas: " + jogador3.getTentativas());
                System.out.println("Total de Pontos: " + jogador3.getTotalPontos());
            }
        }


//        while (totalTentativas > 0) {
//
//            sorteado = roleta.sortear();
//            System.out.println("Foi Sorteado: " + sorteado);
//
//            if (("Perde Tudo".equals(sorteado)) || ("Passa a Vez".equals(sorteado))) {
//
//            } else {
//                totalPontos = totalPontos + Integer.parseInt(sorteado);
//                System.out.println("Total é: " + totalPontos);
//                System.out.println("");
//            }
//
//            if (sorteado == "Perde Tudo") {
//                totalTentativas--;
//                totalPontos = 0;
//                System.out.println("Que Azar Heim, PERDEU TUDO!!!!!!");
//                System.out.println("Mas não se preocupe, você ainda tem " + totalTentativas + " tentativas.");
//            } else if (sorteado == "Passa a Vez") {
//                totalTentativas--;
//                System.out.println("Que Azar Heim, PASSOU A VEZ!!!");
//                System.out.println("Mas não se preocupe, você ainda tem " + totalTentativas + " tentativas.");
//            } else {
////                System.out.println("***** SORTE!!! ****");
////                System.out.println("Para informar uma letra, digite '1' ou digite '2' para tentar adivinhar a palavra");
////                System.out.println("Por favor, escolha uma letra");
////                letra = sc.nextLine().charAt(0);
////                System.out.println("");
////                //totalPontos = totalPontos + Integer.parseInt(sorteado);
////                for (int i = 0; i < palavra.length(); i++) {
////                    if (palavra.charAt(i) == letra) {
////                        System.out.print(letra);
////                    } else {
////                        System.out.print(" __ ");
////                    }
////                }
//            }
//
//            System.out.println("");
//            System.out.println("Sua pontuação atual é: " + totalPontos);
//        }
        System.out.println("");
        System.out.println("FIM DE JOGO ");
        System.out.println("");
    }

}
