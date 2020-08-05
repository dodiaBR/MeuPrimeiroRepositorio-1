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
      
          se (IMC>=18.5) e (IMC<=25) entao
             escreval ("Voce esta no peso ideal")
          fimse
          se (IMC>25) entao
             escreval ("Voce esta acima do peso ideal")
          fimse
          se (IMC<18.5) entao
             escreval ("Voce esta abaixo do peso ideal")
          fimse


      
fimalgoritmo

