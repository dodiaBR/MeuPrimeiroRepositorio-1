algoritmo "ContaNumNegativo"
var
   cont, tNeg, num :inteiro
   resp : caractere
inicio
      cont <- 1
      tNeg <- 0
      repita
            escreval ("Digite o ",cont," numero: ")
            leia (num)
            se (num<0) entao
               tNeg <- tNeg + 1
            fimse
            cont <- cont + 1
            escreval ("Deseja continuar? [s/n]")
            leia (resp)
      ate (resp = "n") ou (resp = "N")
      
      escreval ("O total de numeros negativos foi de ", tNeg)

fimalgoritmo
