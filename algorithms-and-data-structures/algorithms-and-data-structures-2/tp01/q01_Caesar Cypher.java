import java.util.Scanner;

public class q1 {

    // Shifts each character in the string by +3 (Caesar cipher)
    public static void criptografar(String string){
        char[] array = new char[string.length()];

        for(int i = 0; i < string.length(); i++){
            array[i] = (char)(string.charAt(i) + 3);
        }

        String result = new String(array);
        System.out.println(result);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        criptografar(input);
    }
}
