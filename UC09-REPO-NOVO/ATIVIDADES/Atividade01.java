package ATIVIDADES;

import java.util.Scanner;

public class Atividade01{

  public static void main(String[] args) {

    double nu,mero,resultado;

     System.out.println("Digite um número: ");

     Scanner um = new Scanner(System.in);

     nu = um.nextDouble();

     System.out.println("Digite outro número: ");

     Scanner dois = new Scanner(System.in);

     mero = dois.nextDouble();

     resultado = nu + mero;

     System.out.println("O resultado da sua soma é: "+resultado);
    }
}
