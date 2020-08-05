#include<stdio.h>
#include<stdlib.h>
#include<iostream>

using namespace std;

int n1,n2; // variaveis globais

int main(){ //bloco de funcao

    // operadores matematicos: +,-,/,*,% ()

    int n3,n4; // variaveis locais
    int res1, res2;

    n1=11;
    n2=3;
    n3=5;
    n4=2;

    res1=n1/n2;
    res2=n1%n2;  //% mostra o resto da divisao ex: 11/3 --- (3 x 3) = 9 + '%' = 11 // % = 2


   // res1=(n1+n2)*n4;
    //res2=n1+(n2*n4);

    cout <<"Valor de res1: " << res1 <<"\n\n";
    cout <<"Valor de res2: " << res2 <<"\n\n";

    return 0;
}
