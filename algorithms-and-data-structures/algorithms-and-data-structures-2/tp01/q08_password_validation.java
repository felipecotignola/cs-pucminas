import java.util.Scanner;

public class q8 {

    // Validates if the string meets password requirements
    public static boolean Ifstring(String string){

        int contMaiuscula = 0, contMinuscula = 0, contNumero = 0, contEspecial = 0;

        if(string.length() >= 8){

            for(int i = 0; i < string.length(); i++){

                if(string.charAt(i) >= 'A' && string.charAt(i) <= 'Z'){
                    contMaiuscula++;
                }
                else if(string.charAt(i) >= 'a' && string.charAt(i) <= 'z'){
                    contMinuscula++;
                }
                else if(string.charAt(i) >= '0' && string.charAt(i) <= '9'){
                    contNumero++;
                }
                else{
                    contEspecial++;
                }
            }

            return contMaiuscula >= 1 && contMinuscula >= 1 && contNumero >= 1 && contEspecial >= 1;
        }

        return false;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();

        if(Ifstring(string)){
            System.out.println("SIM");
        } else {
            System.out.println("NAO");
        }
    }
}
