#include<stdio.h>
#include<stdlib.h>
#include<iostream>
#include<cstdlib>

using namespace std;



int main(){

    int n1,n2,res;
    char opc;

    inicio:
    system ("cls");
    cout << "Valor nota 1\n";
    cin >> n1;
    cout << "Valor nota 2\n";
    cin >> n2;

    res=n1+n2;

    if (res >=60)
    {
        cout << "\nAluno Aprovado\n";
    }
    else if (res>=40)
    {
        cout <<"\nAluno em Recuperacao\n";
    }
    else
    {
        cout << "Aluno Reprovado";
    }

        cout << "Digite proximas notas? [s/n]" << endl;
        cin >> opc;


         if (opc == 's' or opc=='S'){
            goto inicio;
         }

    return 0;
}
