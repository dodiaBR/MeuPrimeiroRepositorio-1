#include<iostream>
#include<stdio.h>
#include<stdlib.h>

using namespace std;

int main(){

    int valor;

    cout << "Selecione um transporte: \n" << endl;
    cout << "[1]=Carro, [2]=Moto, [3]=Aviao, [4]=Helicoptero\n";
    cin >> valor;
    cout << endl;
    switch(valor){
        case 1:
        case 2:
            cout << "\nTransporte Terrestre\n";
            switch (valor){
                case 1 :
                    cout << "Carro Selecionado\n";
                    break;
                case 2 :
                    cout << "Moto Selecionada\n";
                    break;
           }
           break;
        case 3:
        case 4:
            cout << "\nTransporte Aereo\n";
            switch (valor){
                case 3 :
                    cout << "Aviao Selecionado\n";
                    break;
                case 4 :
                    cout << "Helicoptero Selecionada\n";
                    break;
            }
            break;
    }


        cout << "\nPrograma Finalizado\n";

        return 0;
}
