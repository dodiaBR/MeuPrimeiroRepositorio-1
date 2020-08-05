#include<iostream>
#include<stdio.h>
#include<stdlib.h>

using namespace std;

int main(){

    int valor;

    cout << "Selecione uma Cor \n" << endl;
    cout << "[1,2,3] Verde, [4,5,6] Azul, [7,8,9] Vermelha: ";
    cin >> valor;
    cout << endl;
    switch(valor){
        case 1:
        case 2:
        case 3:
            cout << "Cor Verde selecionada\n";
            break;
        case 4:
        case 5:
        case 6:
            cout << "Cor Azul selecionada\n";
            break;
        case 7:
        case 8:
        case 9:
            cout << "Cor Vermelha selecionada\n";
            break;
        default :
            cout <<"Valor invalido\n";
        }

        cout << "\nPrograma Finalizado\n";

        return 0;
}
