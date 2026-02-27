package Aula1.ATIVIDADES;

import java.util.Scanner;

public class Atividade03 {
    
public static void main(String[] args) {

    double comprimento;
    double largura;
    double resposta;

    System.out.println("Digite o comprimento do seu retângulo: ");
    
    Scanner um = new Scanner(System.in);

    comprimento = um.nextDouble();

    System.out.println("Digite a largura do seu retângulo: ");
    
    Scanner dois = new Scanner(System.in);

    largura = um.nextDouble();

    resposta = comprimento * largura;

    System.out.println("A area do seu retângulo é: "+resposta);


}}