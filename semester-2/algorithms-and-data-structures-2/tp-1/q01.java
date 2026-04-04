import java.util.Scanner;

public class q1 {

    // aplica um deslocamento de +3 em cada caractere da string
    public static void criptografar(String string){

        // array para armazenar os novos caracteres
        char[] array = new char[string.length()];

        // percorre a string caractere por caractere
        for(int i = 0; i < string.length(); i++){

            // pega o caractere atual e soma 3 (cifra simples)
            char letra = (char)(string.charAt(i) + 3);

            // salva o novo caractere no array
            array[i] = letra;
        }

        // transforma o array em string novamente
        String stringfinal = new String(array);

        // imprime o resultado
        System.out.println(stringfinal);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        // lê a linha digitada pelo usuário
        String string = sc.nextLine();

        // chama a função de criptografia
        criptografar(string);

        sc.close();
    }
}
