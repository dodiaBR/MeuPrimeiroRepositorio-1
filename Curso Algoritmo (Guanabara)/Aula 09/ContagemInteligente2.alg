algoritmo "ContagemInteligente"
var
 c, ini, fim : inteiro
 
inicio
      escreval ("----------------------")
      escreval (" CONTAGEM INTELIGENTE ")
      escreval ("----------------------")
      
      escreva ("Inicio: ")
      leia (ini)
      escreva ("Fim: ")
      leia (fim)
      escreval ("----------------------")
      escreval ("       CONTANDO       ")
      escreval ("----------------------")
      
      se (ini<fim) entao
         para c de (ini) ate (fim) passo 1  faca
              escreva (c,"..")
         fimpara
      senao
         para c de (ini) ate (fim) passo -1  faca
              escreva (c,"..")
         fimpara
      fimse
      
      
fimalgoritmo
