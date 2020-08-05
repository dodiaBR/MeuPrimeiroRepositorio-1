#include<stdio.h>
#include<stdlib.h>
#include<iostream>

using namespace std;

#define pi 3.1415; // pre alocar valores ou calculos
#define ide cout << "\n\nPrograma C++\n\n";
int main(){

   /* int vida;
    int municao;
    int life; */

   // int vida,municao,life;
  //  int vida=3,municao=500,life=100;

  //  cout << pi << "\n\n";
  //  ide



        cout << "Pi = " << pi;

        double numero;
        double total;

        cout << "\n\nInsira um valor para multiplicar por Pi: ";
        cin >> numero;

        total = numero * pi;

        cout << "\nO valor e: " << total;



        return 0;

}
