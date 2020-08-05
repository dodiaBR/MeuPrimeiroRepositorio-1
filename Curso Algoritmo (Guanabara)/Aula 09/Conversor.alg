algoritmo "Conversor"

var
   r, d, c, qtd : Real

inicio

      escreval ("Quantas conversoes vc que fazer?")
      leia (qtd)
      c <- 1
      enquanto (c<=qtd) faca
               escreval (c,"ª Conversao: Qual o valor em R$?")
               leia (r)
               d <- r/5.5
               escreval ("O valor é de US$", d:4:2)
               c <- c+1
      fimenquanto
      
fimalgoritmo
