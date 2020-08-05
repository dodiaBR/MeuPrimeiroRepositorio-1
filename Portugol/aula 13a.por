programa
{
	
	funcao inicio()
	{
		cadeia nomes[4] = {"Ticinha", "Paty", "Ivan", "Ticinho"}
		real notas[4][4] = {{10.0,10.0,9.0,10.0},
						{9.0,7.0,8.0,7.0},   
						{9.0,10.0,9.0,10.0},
						{5.0,7.0,6.0,5.0}}   

								
		real medias[4]  // gera media dos alunos
		media(notas, medias) //  invoca a funcao media(real notas[], &medias[]
						 //  &medias está mandando valores para real media[4]
		inteiro aluno 
		escreva("Digite o número do aluno(a): ","\n")
		leia(aluno)
		limpa()
		cadeia apr 
		
		se(aprovadx(medias[aluno])){ // retorno da funcao aprovadx(real nota)
			apr = "APROVADX"        // verdadeiro
		}senao{
			apr = "REPROVADX"       // falso
		}

		geraRelatorio(nomes[aluno],notas[aluno][0],notas[aluno][1],
				    notas[aluno][2],notas[aluno][3], medias[aluno],apr)
				
	}

	funcao logico aprovadx(real nota){ // aprovadx?? simm ou nao (logico)
		se(nota>=6){
			retorne verdadeiro		// retorno logico
		}senao{
			retorne falso			// retorno logico
		}
	}

	funcao media(real notas[][], real &medias[]){
		para(inteiro l=0;l<4;l++){
			real sum = 0.0
			para(inteiro c=0;c<4;c++){
				sum += notas[l][c]
			}
			medias[l] = sum/4
		}
		
	}

	funcao escreveLinha(logico forte){ // 'forte' para diferenciar o tipo de linha
		se (forte){ // se verdadeiro
			escreva ("=================","\n")
		}senao{	  // se falso
			escreva ("-----------------","\n")
		}
	}

	funcao geraRelatorio(cadeia nome, real b1, real b2, real b3, 
					 real b4, real med, cadeia apr){
		
		escreveLinha(verdadeiro)
		escreva (" Alunx  : "+nome,"\n") // [aluno] recebe o leia(aluno)
		escreveLinha(falso)
		escreva ("    1B  :  "+b1,"\n")
		escreva ("    2B  :  "+b2,"\n")
		escreva ("    3B  :  "+b3,"\n")
		escreva ("    4B  :  "+b4,"\n")
		escreveLinha(falso)
		escreva ("  Média : "+med,"\n")
		escreva ("    ",apr,"\n")
		escreveLinha(verdadeiro)
	}
}




/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 1432; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */