import java.util.Scanner;

public class q1 {

    // Applies a Caesar cipher shifting each character by +3
    public static void criptografar(String string) {
        char[] array = new char[string.length()];

        for (int i = 0; i < string.length(); i++) {
            char letra = (char)(string.charAt(i) + 3);
            array[i] = letra;
        }

        String stringfinal = new String(array);
        System.out.println(stringfinal);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reads input until EOF and encrypts each line
        while (sc.hasNextLine()) {
            String string = sc.nextLine();
            criptografar(string);
        }

        sc.close();
    }
}
