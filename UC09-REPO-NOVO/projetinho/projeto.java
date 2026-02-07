package projetinho;

import java.util.Scanner;

public class projeto {

    public static class maratonafilmes{

        public static void exibirCabecalho(){
            System.out.println("===========================================\n");
            System.out.printf("GERENCIADOR MAIS FODA DE MARATONAS DE FILME\n\n");
            System.out.println("===========================================");
        }
        public static double calcularTempoTotal(int filmes,double tempo){

            return filmes * tempo;

        }
        public static String classificarMaratona(double horas){

            String banana = "";
            
            if(horas <= 4){

                 banana = "Maratona leve!";

            }else if(horas > 4 && horas < 8){

                banana = "Maratona moderada!";

            }else if (horas > 8){

                banana =  "Maratona épica!";

            }return banana;

        }
        public static boolean validacaoGamer(int socorro){

            return socorro > 0;

        }

        public static void main(String[] args) {
            String nome = "Roberval";
            double tempoTotal;
            double horas = 1.5;
            int filmes = 4;
            String voltaString;
            exibirCabecalho();
            tempoTotal = calcularTempoTotal(filmes,horas);
            if(validacaoGamer(filmes)){

                voltaString = "true";
             }else{

                voltaString = "false";
             }
             System.out.println("Resultado do Calculartempototal " +tempoTotal);
             System.out.println("");
             System.out.println("Informações da Maratona: "); 
             System.out.println("Usuário: " +nome);
             System.out.println("Filmes planejados: "+filmes);
             System.out.println("Duração média: "+horas);
             System.out.println("");
             System.out.println("Cálculos: ");
             System.out.println("Tempo total: " +calcularTempoTotal(filmes,horas));
             System.out.println("Classificação: " +classificarMaratona(tempoTotal));
             System.out.println("Validação: "+voltaString);
             System.out.println("");
             System.out.println("===========================================");
        }
    }
}
