
package pokemno2;

import java.util.Scanner;

public class Pokemno2 {

    public static void main(String[] args) {
     Scanner teclado = new Scanner (System.in);
    int x;
    x = teclado.nextInt();
    if (x>=20) {
        System.out.println("Maior que 20");
    }
    else {
        System.out.println("Menor que 20");
    }
    }
    
}
