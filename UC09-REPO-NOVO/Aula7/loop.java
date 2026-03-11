 package Aula7;

public class loop {

    public static void countdown(int comandantespok){
        while(comandantespok < 10){
            System.out.println("FAZ O L");
            comandantespok++;
        }
        System.out.println("PARE DE FAZER O L IMEDIATAMENTE");
    }

    public static void sequence(int n){
        while(n != 1){
            System.out.println(n);
            if(n%2==0) n = n/2;
            else n= n * 3 + 1;
        }

    }
    public static void apprecciate(int acerola){
        acerola = 0;
        while(acerola >= -8){
            System.out.print(acerola +", ");
            acerola -= 2;
        }
    }
    public static void apprecciate2(){
        for(int acerola = 2;acerola <= 8;acerola += 2){
            System.out.println(acerola + " , ");

        }
    }
    public static void loopVar(){
        int n;
        for(n =3;n > 0;n--){
            System.out.println(n);

        }
        System.out.println("O valor de n é: "+n);
    }
    public static void nested(){
        for(int x = 1; x <= 0; x++){
            for(int y = 1; y <= 0; y++){
            }
        }
    }
    public static void main(String[] args) {
        int roberval = 2;
        apprecciate(roberval);
        System.out.println("VAI FURIAAAA");
    }
}

