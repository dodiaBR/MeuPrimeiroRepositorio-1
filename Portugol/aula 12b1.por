programa
{
	
	funcao inicio()
	{
		cadeia nomes[] = {"Ticinha", "Paty", "Ivan", "Ticinho"}
		real notas[][] = {{9.5,8.0,10.0,9.5},   // [0][0], [0][1], [0][2], [0][3]
					   {7.5,8.5,10.0,10.0},  // [1][0], [1][1], [1][2], [1][3]
					   {8.5,8.5,9.5,9.5},    // [2][0], [2][1], [2][2], [2][3]
					   {4.5,4.0,7.0,7.0}}	// [3][0], [3][1], [3][2], [3][3]

		real medias[4] // recebe a soma de cada linha dividido por 4
		para (inteiro l=0;l<4;l++){
			real soma = 0.0 // para cada linha o valor de soma volta a ser zero
			para (inteiro c=0;c<4;c++){
				soma += notas[l][c]
			}
			medias[l] = soma/4 // cada linha do vetor recebe soma/4
		}

		inteiro aluno // numero que mostra o nome do aluno no vetor nomes
		escreva("Digite o numero do aluno desejado: ")
		leia(aluno)
		limpa()
		cadeia apr // recebe "aprovado" ou "reprovado" na condicao se..
		
		se (medias[aluno]>6){
			apr = "APROVADX"
		}senao{
			apr = "REPROVADX"
		}

		escreva("=========================","\n")
		escreva("Alunx: "+nomes[aluno],"\n")
		escreva("1 Bimestre: "+notas[aluno][0],"\n")
		escreva("2 Bimestre: "+notas[aluno][1],"\n")
		escreva("3 Bimestre: "+notas[aluno][2],"\n")
		escreva("4 Bimestre: "+notas[aluno][3],"\n")
		escreva("Media: "+medias[aluno],"\n")
		escreva(apr)
		
		
		
		
	}	
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 785; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 7, 7, 5}-{medias, 12, 7, 6};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */