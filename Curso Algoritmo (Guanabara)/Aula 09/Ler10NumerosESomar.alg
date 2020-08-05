algoritmo "Ler10NumerosESomar"
var
   contador, numero, total : real

inicio
      contador <- 1
      escreval("Entre com 10 numeros para somar")
      enquanto (contador <=10) faca
            escreval (contador,"º Numero: ")
            leia (numero)
            total <- total + numero
            contador <- contador +1
      fimenquanto
      escreva ("O valor dos numeros somados é:",total)
fimalgoritmo
