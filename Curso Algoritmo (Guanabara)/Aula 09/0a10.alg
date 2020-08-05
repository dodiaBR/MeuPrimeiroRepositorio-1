algoritmo "conteAte"
var
   contador, valor, salto : Inteiro

inicio

    escreval ("Voce quer que eu conte até quanto?")
    leia (valor)
    escreval ("Qual o valor do salto? ")
    leia (salto)
    contador <- 0
    Enquanto (contador <= valor) faca
        EscrevaL(contador)
        contador <- contador + salto
    FimEnquanto
    Escreval("Terminei de contar")
fimalgoritmo
