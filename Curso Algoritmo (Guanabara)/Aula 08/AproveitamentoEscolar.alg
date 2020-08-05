algoritmo "AproveitamentoEscolar"

var
       nome : caractere
       n1, n2, media : Real

inicio
      escreval("-----------------------")
      escreval("     ESCOLA JAVALI     ")
      escreval(" Aproveitamento Escolar")
      escreval("-----------------------")
      
      Escreval("Nome do Aluno: ")
      leia (nome)
      escreval ("Insira a 1a nota: ")
      leia (n1)
      escreval ("Insira a 2a nota: ")
      leia (n2)
      media <- (n1+n2)/2
      
      se (media>9) entao
         escreva ("Media final:",media," nota: A")
      senao
         se (media<9) e (media>=8) entao
            escreva ("Media final:",media," nota: B")
         senao
            se (media<8) e (media>=7) entao
               escreva ("Media final:",media," nota: C")
            senao
               se (media<7) e (media>=6) entao
                  escreva ("Media final:",media," nota: D")
               senao
                  se (media<6) e (media>=5) entao
                     escreva ("Media final:",media," nota: E")
                  senao
                     escreva ("Media final:",media," nota: F")
                  fimse
               fimse
            fimse
         fimse
      fimse

      
      
      
      
      



fimalgoritmo
