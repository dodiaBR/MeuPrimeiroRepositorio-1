algoritmo "Cálculo IMC"
var
   massa, altura, IMC : Real

inicio
      Escreval ("Vamos calcular seu indice de massa corporal")
      Escreva ("Digite seu peso (Kg) ")
      leia (massa)
      Escreva ("Digite sua altura (m) ")
      leia (altura)
      Escreval ("O Valor ideal do IMC está entre 18,5 e 25")
      IMC <- massa/altura^2
      Escreval ("Seu indice IMC atual é: ",IMC:1:1)

      se (IMC<17) entao
         escreval ("Muito abaixo do Peso")
      senao
           se (IMC>=17) e (IMC<18.5) entao
              escreval ("Abaixo do Peso")
           senao
                se (IMC>=18.5) e (IMC<25) entao
                   escreval ("Peso Ideal")
                senao
                     se (IMC>=18.5) e (IMC<25) entao
                        escreval ("Peso Ideal")
                     senao
                          se (IMC>=25) e (IMC<30) entao
                             escreval ("Sobrepeso")
                          senao
                               se (IMC>=30) e (IMC<35) entao
                                  escreval ("Obesidade")
                               senao
                                    se (IMC>=35) e (IMC<40) entao
                                       escreva ("Obesidade Severa")
                                    senao
                                         escreval ("Obesidade Morbida")
                                    fimse
                               fimse
                          fimse
                     fimse
                fimse
           fimse
      fimse



fimalgoritmo
