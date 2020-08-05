#include<iostream>
#include<stdio.h>
#include<stdlib.h>

using namespace std;

int main(){

    int valor;

    cout << "Selecione uma Cor \n" << endl;
    cout << "[1] Verde, [2] Azul, [3]Vermelha: ";
    cin >> valor;
    cout << endl;
    switch(valor){
        case 1:
            cout << "Cor Verde Selecionada\n";
            break;
        case 2:
            cout << "Cor Azul Selecionada\n";
            break;
        case 3:
            cout << "Cor Vermelha Selecionada\n";
            break;
        default :
            cout <<"Valor invalido\n";
        }

        cout << "\nPrograma Finalizado\n";

        return 0;
}
