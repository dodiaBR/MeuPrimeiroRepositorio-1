algoritmo "DependentesFuncionario"

var
   nome : caracter
   salario, nSalario : Real
   dep : inteiro
   
inicio
      escreval ("Qual o nome do Funcionário?")
      leia (nome)
      escreval ("Qual o salario do funcionario?")
      leia (salario)
      escreva ("Qual a quantidade de dependentes?")
      leia (dep)
      escolha dep
              caso 0
                   nSalario <- salario + (salario*5/100)
              caso 1,2,3
                   nSalario <- salario + (salario*10/100)
              caso 4,5,6
                   nSalario <- salario + (salario*15/100)
              outrocaso
                   nSalario <- salario + (salario*18/100)
      fimescolha
      escreval ("Ola ",nome,", seu novo salario é de R$",nsalario)
      escreval ("Voce possui", dep," dependentes")
      
fimalgoritmo
