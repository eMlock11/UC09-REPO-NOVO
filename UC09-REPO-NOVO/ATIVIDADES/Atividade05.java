package ATIVIDADES;

import java.util.Scanner;

public class Atividade05 {
   public static void main(String[] args) {

    int seg;

    double minseg;

    Scanner um = new Scanner(System.in);

    System.out.println("Digite uma quantidade de segundos: ");
    
    seg = um.nextInt();

    minseg = seg/60;

    System.out.println("Conversão para minutos: "+minseg +"Min");

}
}
