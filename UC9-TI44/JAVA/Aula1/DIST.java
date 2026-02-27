package Aula1;

public class DIST {

public static void calculardistancia(double t1,double t2,double f1,double f2,double result,double dt){
    t1 = 2;
    t2 = 5;
    f1 = 8;
    f2 = 14;
    System.out.println(result);
    }
    public static void main(String[] args) {
        double x1;
        double x2;
        double y1;
        double y2;
        double distX,distY,dx,dy,resultado;
        x1 = 70;
        y1 = 0;
        x2 = 0;
        y2 = 1;
        dx = x2 - x1;
        dy = y2 - y1;
        distX = dx + dx;
        distY = dy + dy;
        System.out.println("Distancia do eixo X: "+distX);
        System.out.println("Distancia do eixo Y: "+distY);
        calculardistancia(x1);
        resultado = Math.sqrt((distX + distY));
        //System.out.println(resultado);
    }
}
