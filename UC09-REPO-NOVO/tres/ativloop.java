package tres;

public class ativloop {

    public static void regressiva(int n){
        n=10;
        while(n > 1){
            System.out.println(n);
            n--;
        }
    }
    public static void progressiva(int n){
        while(n < 20){
            System.out.println(n);
            n++;
        }
    }
    public static void par(int n){
        for(int i = 1; i <= 50 ;i++){
            if(i % 2==0){
                System.out.println(i);
            }
        }
    }
    
   public static void main(String[] args) {

   
   }
}

