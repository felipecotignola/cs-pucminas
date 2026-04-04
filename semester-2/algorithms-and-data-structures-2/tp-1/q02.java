import java.util.Scanner;
import java.util.Random;

public class q2 {

    // Replaces all occurrences of a randomly chosen character with another
    public static void sort(String string, Random rand){

        char letra1 = (char)('a' + rand.nextInt(26));
        char letra2 = (char)('a' + rand.nextInt(26));

        char[] array = new char[string.length()];

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == letra1){
                array[i] = letra2;
            } else {
                array[i] = string.charAt(i);
            }
        }

        System.out.println(new String(array));
    }

    public static void main(String[] args){

        // Fixed seed for deterministic output
        Random rand = new Random(4);

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        while(!string.equals("FIM")){
            sort(string, rand);
            string = sc.nextLine();
        }
    }
}
