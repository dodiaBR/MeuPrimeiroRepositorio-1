algoritmo "RepitaNaTaboada"
var
   res, num, cont :inteiro
inicio
      cont <- 1
      escreval ("Eu quero a tabuada de: ")
      leia (num)
      repita
            res <- num * cont
            escreval (num, " x", cont, " =", res)
            cont <- cont + 1
      ate (cont>10)
fimalgoritmo
