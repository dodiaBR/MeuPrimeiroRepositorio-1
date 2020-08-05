#include<iostream>
#include<stdio.h>
#include<stdlib.h>

using namespace std;

int main(){

        // (expressao) ? valor1 : valor2;

        int n1,x;
        x=5;

        cout << "Insira um valor: ";
        cin >> n1;
        (n1>=10) ? x++ : x--;


        cout << "\nNovo valor de x: " << x << endl;
        cout << endl;


        return 0;
}
