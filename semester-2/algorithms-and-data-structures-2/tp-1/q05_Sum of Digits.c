#include <stdio.h>

// Recursively sums the digits of an integer
int recursao(int n){
    if(n < 10){
        return n;
    }
    return (n % 10) + recursao(n / 10);
}

int main(){
    int n;
    scanf("%d", &n);

    printf("%d", recursao(n));
}
