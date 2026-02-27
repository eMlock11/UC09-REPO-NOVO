package Aula1;

import java.util.Scanner;

public class atividade1 {

    public static void main(String[] args) {

        String pn,sn,pn1,pn2,sn1,sn2;

        Scanner in = new Scanner(System.in);

        System.out.println("Qual o seu primeiro nome?");

        pn = in.nextLine();

        System.out.println("Qual o seu Sobrenome?");

        sn = in.nextLine();

        sn.toUpperCase();

        pn1 = pn.substring(0, 1).toUpperCase();

        pn2 = pn.substring(1);

        sn1 = sn.substring(0, 1).toUpperCase();

        sn2 = sn.substring(1);

        System.out.print(pn1+pn2);

        System.out.print(" ");

        System.out.print(sn1+sn2);



        

        


    }
    
    

}