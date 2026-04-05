import java.util.Scanner;

public class q3 {

    // Checks if the string contains only vowels
    public static boolean Ifvogal(String string){
        int cont = 0;

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) == 'a' || string.charAt(i) == 'A' ||
               string.charAt(i) == 'e' || string.charAt(i) == 'E' ||
               string.charAt(i) == 'i' || string.charAt(i) == 'I' ||
               string.charAt(i) == 'o' || string.charAt(i) == 'O' ||
               string.charAt(i) == 'u' || string.charAt(i) == 'U'){
                cont++;
            }
        }

        return cont == string.length();
    }

    // Checks if the string contains only consonants
    public static boolean Ifconsoante(String string){
        int cont = 0;

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z' ||
               string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                cont++;
            }
        }

        if(cont == string.length()){
            int cont2 = 0;

            for(int i = 0; i < string.length(); i++){
                if(string.charAt(i) == 'a' || string.charAt(i) == 'A' ||
                   string.charAt(i) == 'e' || string.charAt(i) == 'E' ||
                   string.charAt(i) == 'i' || string.charAt(i) == 'I' ||
                   string.charAt(i) == 'o' || string.charAt(i) == 'O' ||
                   string.charAt(i) == 'u' || string.charAt(i) == 'U'){
                    cont2++;
                }
            }

            return cont2 == 0;
        }

        return false;
    }

    // Checks if the string represents an integer
    public static boolean IfInt(String string){
        int cont = 0;

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) >= '0' && string.charAt(i) <= '9'){
                cont++;
            }
        }

        return cont == string.length();
    }

    // Checks if the string represents a real number with at most one separator
    public static boolean Ifreal(String string){
        int numeros = 0, virgulas = 0;

        for(int i = 0; i < string.length(); i++){
            if(string.charAt(i) >= '0' && string.charAt(i) <= '9'){
                numeros++;
            }
            if(string.charAt(i) == ',' || string.charAt(i) == '.'){
                virgulas++;
            }
        }

        return numeros + virgulas == string.length() && virgulas <= 1;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        if(Ifvogal(string)){
            System.out.print("SIM ");
        } else {
            System.out.print("NAO ");
        }

        if(Ifconsoante(string)){
            System.out.print("SIM ");
        } else {
            System.out.print("NAO ");
        }

        if(IfInt(string)){
            System.out.print("SIM ");
        } else {
            System.out.print("NAO ");
        }

        if(Ifreal(string)){
            System.out.print("SIM ");
        } else {
            System.out.println("NAO ");
        }
    }
}
