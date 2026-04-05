import java.util.Scanner;

public class q12 {

    // Recursively sums the digits of an integer
    public static int recursao(int numero){
        if(numero < 10){
            return numero;
        }
        return (numero % 10) + recursao(numero / 10);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        System.out.println(recursao(numero));
    }
}
