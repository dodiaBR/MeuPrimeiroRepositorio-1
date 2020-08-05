
algoritmo "semnome"
var
    cont, qtd, nota, maior : real
    nome, melhor :caractere
inicio
      escreval ("------------------------")
      escreval (" ESCOLA SANTA PACIÊNCIA ")
      escreval ("------------------------")
      
      escreva("Quantos alunos a turma tem? ")
      leia (qtd)
      cont <- 1
      enquanto (cont<=qtd) faca
      escreval ("")
      escreval ("Aluno nº", cont)
      escreva ("Nome do aluno: ")
      leia (nome)
      escreva ("Nota de ",nome,": ")
      leia (nota)
      escreval ("------------------")
      cont <- cont + 1
      
           se (nota>maior) entao
              maior <- nota
              melhor <- nome
           fimse
      fimenquanto
      escreva ("")
      escreval ("O Melhor Aluno foi ",melhor," com a nota", maior)
fimalgoritmo
