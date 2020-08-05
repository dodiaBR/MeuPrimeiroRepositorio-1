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
      
      enquanto (ini<fim) faca
               escreva (ini,"..")
               ini <- ini + 1
      fimenquanto
      
      enquanto (ini>=fim) faca
               escreva (ini,"..")
               ini <- ini - 1
      fimenquanto
      
      
fimalgoritmo
