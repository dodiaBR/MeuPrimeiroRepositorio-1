algoritmo "PartidaFutebol"
var
   time1, time2, dif : inteiro
   Clube1, Clube2 : Caracter


inicio
      escreval ("x-x-x-x-x-x-x-x-x-x")
      escreval (" RESUMO DA PARTIDA ")
      escreval ("x-x-x-x-x-x-x-x-x-x")
      escreval ("")
      escreval ("Insira o mandante: ")
      leia (clube1)
      escreval ("")
      escreval ("Insira o visitante: ")
      leia (clube2)
      escreval ("")
      escreval ("Qtos gols do ",clube1,"?")
      leia(time1)
      escreval ("")
      escreval ("Qtos gols do ",clube2,"?")
      leia (time2)

      se (time1>time2) entao
         dif <- time1-time2
         escolha (dif)
         caso 0
             escreval ("EMPATE")
         caso 1
             escreval ("O ", clube1," venceu por uma diferenca de",dif," gol")
             escreval ("PARTIDA NORMAL")
         caso 2,3
             escreval ("O ", clube1," venceu por uma diferenca de",dif," gols")
             escreval ("PARTIDA NORMAL")
         outrocaso
             escreval ("O ", clube1," venceu por uma diferenca de",dif," gols")
             escreval ("GOLEADA")
         fimescolha
      senao
         dif <- time2-time1   // time2>time1
         escolha (dif)
         caso 0
             escreval ("EMPATE")
         caso 1
             escreval ("O ", clube2," venceu por uma diferenca de",dif," gol")
             escreval ("PARTIDA NORMAL")
         caso 2,3
             escreval ("O ", clube2," venceu por uma diferenca de",dif," gols")
             escreval ("PARTIDA NORMAL")
         outrocaso
             escreval ("O ", clube2," venceu por uma diferenca de",dif," gols")
             escreval ("GOLEADA")
         fimescolha
      fimse
      escreval ("x-x-x-x-x-x-x-x-x-x")
      escreval (" RESUMO DA PARTIDA ")
      escreval ("x-x-x-x-x-x-x-x-x-x")
fimalgoritmo
