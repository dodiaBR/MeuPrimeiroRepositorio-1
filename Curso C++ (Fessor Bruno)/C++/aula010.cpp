#include<stdio.h>
#include<stdlib.h>
#include<iostream>

using namespace std;



int main(){

    int n1, n2, res;
    char opc;


    cout << "Digite o valor da nota 1: " << endl;
    cin >> n1;

    cout << "Digite o valor da nota 2: " << endl;
    cin >> n2;

    res = n1+n2;

    if (res >=60)
    {
        cout << "\nParabens voce foi aprovado!!" << endl;
    }
    else
    {
        cout << "\nAluno Reprovado" << endl;
    }

}
