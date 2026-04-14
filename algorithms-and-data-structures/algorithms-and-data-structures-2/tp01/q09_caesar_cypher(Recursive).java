import java.util.Scanner;

public class q9 {

    // Recursively applies Caesar cipher (+3) to each character of the string
    public static String cifraRecursiva(String string, int i) {

        // Base case: reached end of string
        if (i == string.length()) {
            return "";
        }

        // Shift current character by +3
        char letra = (char)(string.charAt(i) + 3);

        // Combine current character with recursive result of the rest
        return letra + cifraRecursiva(string, i + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input until EOF
        while (sc.hasNextLine()) {
            String string = sc.nextLine();

            // Print encrypted string
            System.out.println(cifraRecursiva(string, 0));
        }

        sc.close();
    }
}
