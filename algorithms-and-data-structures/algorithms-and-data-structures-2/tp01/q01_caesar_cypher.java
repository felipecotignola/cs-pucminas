import java.util.Scanner;

public class q1 {

    // Shifts each character in the string by +3 (Caesar cipher style)
    public static void criptografar(String string){
        char[] array = new char[string.length()];

        for(int i = 0; i < string.length(); i++){
            array[i] = (char)(string.charAt(i) + 3); // shift character
        }

        System.out.println(new String(array)); // print result
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        // Read multiple lines until EOF
        while(sc.hasNextLine()){
            String input = sc.nextLine();
            criptografar(input); // process each line
        }

        sc.close();
    }
}
