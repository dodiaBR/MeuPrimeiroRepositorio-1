#include<stdio.h>
#include<stdlib.h>
#include<iostream>

using namespace std;


int main(){

    //TIPO NOME;
    //TIPO NOME = VALOR;


    //int vidas; // Variavel inteiras,1,4,20..//
    //char letra; // 1 byte, uma letra, um caracter//
    //char letras[20];// vetor, cada letra fica em uma posicao do vetor
   // double decimal; //2.49999999
   // float // 2.5 identico ao double mas tem uma precisao menor//
   // bool vivo; // verdadeiro ou falso ( 1 e 0 )
   // string nome; // "Proograma C++"

    int vidas=0;
    char letra='B';
    char letras[20]="Programa C++";
    double decimal=5.2;
    float decimal2=5.2;
    bool vivo=true;
    string nome="Ivan";

        cout << "Digite o numero de vidas: ";
        cin >> vidas;
        cout << "Digite uma letra: ";
        cin >> letra;
        cout << "Cachorro ou Gato? ";
        cin >> letras;
        cout << "Qual a sua altura? ";
        cin >> decimal;
        cout << "Sua temperatura: ";
        cin >> decimal2;
        cout << "Esta vivo?, (0) para sim e (1) para nao: ";
        cin >> vivo;
        cout << "Qual o seu nome? ";
        cin >> nome;


   //____________________________________________

       /* cout << vidas << "\n";
        cout << letra << "\n";
        cout << letras << "\n";
        cout << decimal << "\n";
        cout << decimal2 << "\n";
        cout << vivo << "\n";
        cout << nome << "\n";
*/
        cout << "\nVidas: " << vidas << "\n"
        << "Letra: "<< letra << "\n"
        << "Letras: "<< letras << "\n"
        << "Altura: " << decimal << "\n"
        << "Temperatura: "<< decimal2 << "\n"
        << "1 ou 0: "<< vivo << "\n"
        << "Seu nome: " << nome <<"\n";


    system("pause");
    return 0;

}
