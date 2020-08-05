#include<iostream>
#include<stdio.h>
#include<stdlib.h>

using namespace std;

int main(){

    int num;

    /* 1 2 3 4 5 6 7 8 9 10
    >4 e <7; and &&
    */

     /* 1 2 3 4 5 6 7 8 9 10
    <3 ou >7; or ||
    */

    //num = 5;
    num = 9;

   /* if (num>4 && num<7){
        cout << "\nValor aceito\n";
    }
    else{
        cout << "\nNao aceito\n";
    }
*/

    if (num < 3 || num >8){
        cout << "\nVAlor aceito";
    }else{
        cout << "\nNao Aceito";
    }


    return 0;

}
