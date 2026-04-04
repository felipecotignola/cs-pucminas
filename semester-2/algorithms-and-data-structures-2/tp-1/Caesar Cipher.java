import java.util.Scanner;

public class q1 {

    // Applies a Caesar cipher with shift +3
    public static void criptografar(String string){

        char[] array = new char[string.length()];

        for(int i = 0; i < string.length(); i++){
            array[i] = (char)(string.charAt(i) + 3);
        }

        System.out.println(new String(array));
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        criptografar(string);
    }
}
