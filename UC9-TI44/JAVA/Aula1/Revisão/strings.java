package Aula1.Revisão;

public class strings {

    public static void main(String[] args) {
        
        char letra;
        String fruta = "banAna";

        String s1 = "Alan Touring";
        String s2 = "Ada Lovelace";

        int diff = s1.compareTo(s2);

        if(diff < 0){
            System.out.println("s1 vem antes do s2");
        }else if(diff >0){
            System.out.println("s2 vem antes do s1");
        }else{
            System.out.println("os nomes são iguais");
        }
        System.out.println(diff);

        letra = 'a';

        for(int i = 0;i < 1000000000;i++){
            System.out.print(letra + i);
        }
    }
    
}
