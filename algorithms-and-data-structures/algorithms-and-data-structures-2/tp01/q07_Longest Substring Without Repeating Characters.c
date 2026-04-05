#include <stdio.h>

// Removes trailing newline added by fgets
void removerEnter(char string[]){
    for(int i = 0; string[i] != '\0'; i++){
        if(string[i] == '\n'){
            string[i] = '\0';
        }
    }
}

// Returns length of longest substring without repeating characters
int tamSubstring(char string[]){
    int max = 0;

    // Try each position as starting point
    for(int i = 0; string[i] != '\0'; i++){
        int used[256] = {0}; // ASCII frequency map
        int length = 0;

        // Expand while characters are unique
        for(int k = i; string[k] != '\0' && used[(unsigned char)string[k]] == 0; k++){
            used[(unsigned char)string[k]] = 1;
            length++;
        }

        if(length > max){
            max = length;
        }
    }

    return max;    
}

int main(){
    char string[255];

    fgets(string, 255, stdin);
    removerEnter(string);

    printf("%d", tamSubstring(string));
}
