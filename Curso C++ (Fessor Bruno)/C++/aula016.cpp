#include<iostream>
#include<stdio.h>
#include<stdlib.h>

using namespace std;

int main(){

    int cont;

    cont=0;

    do{  // teste logico assim como if
        cout << "Texto - " << cont << "\n";
        cont++;

        }while (cont <=20);

      cout << "\nRotina Finalizada\n";

    return 0;
}
