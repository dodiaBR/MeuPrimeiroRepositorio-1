algoritmo "Ler5NumerosSomarEMostrarMaior"
var
   contador, numero, total, maior, menor : real

inicio
      contador <- 1
      maior <- 0
      escreval("Entre com 5 numeros para somar")
      enquanto (contador <=10) faca
            escreval (contador,"º Numero: ")
            leia (numero)
            se  (numero > maior) entao
                maior <- numero

            senao
                 menor <- maior
                 se (numero < menor) entao
                 menor <- maior
                 menor <- numero
                 fimse
            fimse
            total <- total + numero
            contador <- contador +1
      fimenquanto
      escreval("O valor dos numeros somados é:",total)
      escreval("O maior valor é:",maior)
      escreval("O menor valor é:",menor)
fimalgoritmo
