#include<iostream>
using namespace std;
int main(){

    int cont;
    cont=0;

    while(cont< 1000){
        cout << cont <<"\n";
        //cont++; // para no ultimo incremento 499 + 1 = 500 quando 500 == cont executa o if
        if(cont==500){
                 system("pause");

        }
        cont++;
    }
    return 0;
}


//break apenas
