algoritmo "RepitaSomandoValores"
var
    c, n, soma : inteiro
    resp : caractere
inicio
      c<-1
      soma<-0
      repita
            escreval ("Digite o ",c,"º valor")
            leia (n)
            soma <- soma + n
            c <- c+1
            escreval ("Deseja continuar? [s/n]")
            leia (resp)
            ate (resp="n")ou (resp="N")
      escreval ("A soma dos valores é: ", soma)
fimalgoritmo
