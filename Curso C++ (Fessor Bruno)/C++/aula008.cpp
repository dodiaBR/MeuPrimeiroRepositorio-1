#include<stdio.h>
#include<stdlib.h>
#include<iostream>

using namespace std;



int main(){

    int num=10;

    cout << num << "\n\n";


     num = num * -1;

    //num = -10;

    //cout << -num << "\n\n"; // valor real negativo (mas nao grava a inversao na variavel)
    //cout << num << "\n\n";  //volta o valor original

    //simplificado

    num=-num; // caso definitivo de inversao

    cout << num << "\n\n";

    return 0;
}
