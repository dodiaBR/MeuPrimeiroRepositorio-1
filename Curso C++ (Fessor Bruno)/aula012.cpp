#include<iostream>
#include<stdio.h>
#include<stdlib.h>

using namespace std;

int main(){

        // (expressao) ? valor1 : valor2;

        int n1,n2,nota;
        string res;
inicio:
        cout << "Insira sua 1a nota: ";
        cin >> n1;
        cout << "insira sua 2a nota: ";
        cin >> n2;

        nota=n1+n2;

        // >=60 Aprovado
        //  <60  Reprovado

        //(nota>=60) ? res="Aprovado" : res="Reprovado";
        res=(nota>=60)  ? "Aprovado" : "Reprovado";
        cout << "\nSituacao do Aluno: " << res << endl;
        cout << endl;

goto inicio;

        return 0;
}
