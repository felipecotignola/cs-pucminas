import java.util.Scanner;

public class q11 {

    // Recursively builds the reversed string from end to start
    public static String inverter(String string, int i) {

        // Base case: finished all characters
        if (i < 0) {
            return "";
        }

        // Add current character and continue with previous index
        return string.charAt(i) + inverter(string, i - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input until EOF
        while (sc.hasNextLine()) {
            String string = sc.nextLine();

            // Print reversed string
            System.out.println(inverter(string, string.length() - 1));
        }

        sc.close();
    }
}
