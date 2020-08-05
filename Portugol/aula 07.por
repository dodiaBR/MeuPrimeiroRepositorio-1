programa
{
	
	funcao inicio()
	{
		real nota
		escreva (" Insira a Nota: ")
		leia (nota)
		se(nota < 0 ou nota > 100){
			escreva ("Nota Invalida")
		}senao se(nota <= 40){
			escreva ("Reprovado")
		}senao se(nota < 60){
			escreva ("Recuperação")
		}senao se(nota > 80){
			escreva ("Aprovado com merito")
		}senao se(nota >= 60){
			escreva ("Aprovado")
		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 366; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */