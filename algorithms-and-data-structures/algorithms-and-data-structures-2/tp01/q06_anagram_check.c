#include <stdio.h>

// Returns the length of the string
int tam(char str[]){
    int tam = 0;
    for(int i = 0; str[i] != '\0'; i++){
        tam++;
    }
    return tam;
}

// Removes newline character from fgets input
void removerEnter(char string[]){
    for(int i = 0; string[i] != '\0'; i++){
        if(string[i] == '\n'){
            string[i] = '\0';
        }
    }
}

// Converts string to lowercase
void toLower(char str[]){
    for(int i = 0; str[i] != '\0'; i++){
        if(str[i] >= 'A' && str[i] <= 'Z'){
            str[i] = str[i] + 32;
        }
    }
}

// Checks if two strings are anagrams
int anagrama(char str1[], char str2[]){
    int k1 = tam(str1), k2 = tam(str2);

    if(k1 != k2){
        return 0;
    }

    for(int i = 0; str1[i] != '\0'; i++){
        int achou = 0;

        for(int k = 0; str2[k] != '\0'; k++){
            if(str1[i] == str2[k] && achou == 0){
                achou = 1;
                str2[k] = 1;
            }
        }

        if(achou == 0){
            return 0;
        }
    }

    return 1;
}

int main(){
    char str1[255], str2[255];

    fgets(str1, 255, stdin);
    fgets(str2, 255, stdin);

    removerEnter(str1);
    removerEnter(str2);

    toLower(str1);
    toLower(str2);

    if(anagrama(str1, str2)){
        printf("SIM\n");
    } else {
        printf("NAO\n");
    }

    return 0;
}
