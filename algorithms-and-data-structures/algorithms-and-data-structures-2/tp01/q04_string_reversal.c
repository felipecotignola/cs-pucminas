#include <stdio.h>

// Returns the length of the string (excluding '\0')
int tamanhoString(char string[]){
    int i = 0;
    while(string[i] != '\0'){
        i++;
    }
    return i;
}

// Removes newline character from fgets input
void removerEnter(char string[]){
    int i = 0;
    while(string[i] != '\0'){
        if(string[i] == '\n'){
            string[i] = '\0';
        }
        i++;
    }
}

// Swaps two characters in the string
void swap(char string[], int i, int k){
    char temp = string[i];
    string[i] = string[k];
    string[k] = temp;
}

// Reverses the string in-place
char* inverter(char string[]){
    int i = 0;
    int k = tamanhoString(string) - 1;

    while(i < k){
        swap(string, i, k);
        i++;
        k--;
    }

    return string;
}

int main(){
    char string[255];

    fgets(string, 255, stdin);
    removerEnter(string);

    printf("%s", inverter(string));

    return 0;
}
