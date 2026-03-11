package Aula7;
public class array {

    public static void printArray(int[] a){

        for(int z = 0;z < a.length;z++){

            System.out.println(a[z]);
        }
    }
    
    public static void main(String[] args) {
        int[] counts;
        double[] values;
        int size = 10;

        //criação do vetor demoniaco
        counts = new int[4];
        values = new double [size];
        int[] a = {1,2,3,4};
        counts[0] = 7;
        counts[1] = counts[0] *2;
        counts[2]++;
        counts[3] -= 60;

        for(int i = 0;i<4;i++){
            System.out.println(counts[i]);
        }

        //int i = 0;
        //while(i < 4){
          //  System.out.println(counts[i]);
         //   i++;
       // }
    }
}
