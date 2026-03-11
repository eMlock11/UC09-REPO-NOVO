package Aula7;

public class strings {
    public static void main(String[] args) {
        String fruta = "banAna";
        char letra;

        for(char c = 'A';c <= 'z';c ++){
            System.out.print(c);
            if(c == 'Z'){
                System.out.print(" ");
                c += 6;
            }
        }
    }
}
