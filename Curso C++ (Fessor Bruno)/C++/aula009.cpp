#include<stdio.h>
#include<stdlib.h>
#include<iostream>

using namespace std;



int main(){

    int num = 10;
    char opc = 's'; // caracter entre ''


    /* se (teste logico){
      {
        cout...
      }
      se não / caso contrario
      {
        cout...
      }
      */


      if (num>=10)
      {
          cout << "Valor de num Maior ou igual a 10";
      }
      else if (num<10)
      {
          cout << "Valor menor que 10";
      }

    return 0;
}

// comparacao de variaveis, o resultado eh um boolean, true or false;
// teste logico
// >, <, >=, <=, ==, "!="
// 10 < 5 = false // 10 > 8 = true // 100 >(50*2) = false // 100 >= (50*2) = true

