programa
{
	
	funcao inicio()
	{
		/*cadeia filhx = "XY"
		se(filhx=="XY" ou filhx=="XX"){
			escreva("Sim.")			
		}senao{
			escreva("Não.")			
		} */

		cadeia pais
		inteiro idade
		logico permitido
		escreva ("Country/País (BRA, USA, POR)\n")
		leia(pais)
		limpa()
		se (pais=="BRA" ou pais=="POR"){
			escreva("Qual a idade? ")
		}senao{
			escreva("Age")
		}
		leia(idade)
		limpa()

		/*se(pais=="BRA" e idade >= 18){ // 'e' obriga que as duas logicas sejam vdd
			permitido = verdadeiro
		}senao se(pais=="USA" e idade >=21){
			permitido = verdadeiro
		}senao se(pais=="POR"){
			permitido = verdadeiro			
		}senao{
			permitido = falso
		}*/

		// resumindo codigo acima

		se((pais=="BRA" e idade >= 18) ou (pais=="USA" e idade >= 21) ou pais=="POR"){
			permitido = verdadeiro
		}senao{
			permitido = falso
		}

		se (permitido e (pais=="POR" ou pais=="BRA")){
			escreva("Permitido.")
		}senao se (permitido e pais=="USA"){
			escreva("Allowed.")
		}senao se (nao permitido e pais=="USA"){
			escreva("Not Allowed.")
		}senao se (nao permitido e (pais=="POR" ou pais=="BRA")){
			escreva("Não Permitido.")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 828; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */