//https://olimpiada.ic.unicamp.br/pratique/p1/2007/f1/colisoes/

import java.util.Scanner;

public class Colisoes {
    public static void main (String[] args) {
    int x0A, y0A, x1A, y1A;
    int x0B, y0B, x1B, y1B;
    Scanner teclado = new Scanner(System.in);
    x0A = teclado.nextInt();
    y0A = teclado.nextInt();
    x1A = teclado.nextInt();
    y1A = teclado.nextInt();
    x0B = teclado.nextInt();
    y0B = teclado.nextInt();
    x1B = teclado.nextInt();
    y1B = teclado.nextInt();
    
    byte saida = 1;
    if(x0B > x1A || x1B < x0A || y0B > y1A || y1B < y0A){
        saida = 0;
    }
    System.out.println(saida);
}
    }
