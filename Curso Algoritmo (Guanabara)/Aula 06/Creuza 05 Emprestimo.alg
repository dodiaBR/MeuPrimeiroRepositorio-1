algoritmo "Creuza Emprestimo"
var
   vEmp, taxa, parcelas, vTotal, vParc : Real
inicio
      Escreva ("Quanto voce quer pegar de emprestimo? R$")
      leia (vEmp)
      Escreval ("O banco cobra uma txa de 20% sobre o valor total")
      taxa <- (vEmp*20)/100
      Escreval ("A taxa (20%) ficou de: R$", taxa)
      vTotal <- vEmp+taxa
      Escreval ("O valor Total é de: R$ ", vTotal)
      Escreva ("Voce gostaria de parcelar em quantas vezes? ")
      leia (parcelas)
      vParc <- vTotal/parcelas
      Escreval ("Voce irá pagar",parcelas," parcelas de R$",vParc)
fimalgoritmo
