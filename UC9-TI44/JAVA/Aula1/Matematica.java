package Aula1;

import java.util.Scanner;

class Matematica{

    public static void main(String[] args) {

        double diam;

        double x;

        double raio;

        double resultado;

        x = Math.PI;

        Scanner entradausuario = new Scanner(System.in);

         System.out.println("Digite o diametro do seu circulo");

         diam = entradausuario.nextDouble();

         raio = diam/2;

         resultado=(Math.pow(raio, 2) * x);

        System.out.println(resultado);


    }

}