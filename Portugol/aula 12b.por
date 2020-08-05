programa
{
	
	funcao inicio()
	{
		cadeia nomes[4] = {"Ticinha", "Paty", "Ivan", "Ticinho"} // 0,1,2,3
		real notas[4][4] = {{10.0,10.0,9.0,10.0}, // Ticinha
						{9.0,7.0,8.0,7.0},    // Paty
						{9.0,10.0,9.0,10.0},  // Ivan
						{5.0,7.0,6.0,5.0}}    // Ticinho

		real medias [4]  // nomes(linhas) de 0 a 3 / recebe o valor para cada media[l]
		
		para(inteiro l=0;l<4;l++){
			real soma = 0.0 //sempre que mudar de linha, 'soma' volta ao valor 0.0			
			para (inteiro c=0;c<4;c++){
				soma += notas[l][c]	// l[0] recebe as 4 colunas, l[1] recebe 4 colunas etc.
			}
			medias[l] = soma/4 // l[0] soma/4 ... l[1] soma/4 etc..
		}

		inteiro aluno // 0 a 3, aluno vai se referir as linhas de 'medias'
		escreva("Digite o número do aluno(a): ","\n")
		leia(aluno)
		limpa()
		cadeia apr // vai receber texto "aprovado" ou "reprovado" se...
		se(medias[aluno]>=6){
			apr = "APROVADX"
		}senao{
			apr = "REPROVADX"
		}

		//para (aluno=0;aluno<4;aluno++){ //mostra as notas, medias e situacao de todos alunos
		
		escreva ("=================","\n")
		escreva (" Alunx  : "+nomes[aluno],"\n")
		escreva ("-----------------","\n")
		escreva ("    1B  :  "+notas[aluno][0],"\n")
		escreva ("    2B  :  "+notas[aluno][1],"\n")
		escreva ("    3B  :  "+notas[aluno][2],"\n")
		escreva ("    4B  :  "+notas[aluno][3],"\n")
		escreva ("-----------------","\n")
		escreva ("  Média : "+medias[aluno],"\n")
		escreva ("    ",apr,"\n\n")

		}
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 931; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = {notas, 7, 7, 5}-{medias, 12, 7, 6}-{l, 14, 15, 1}-{soma, 15, 8, 4}-{c, 16, 17, 1};
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */