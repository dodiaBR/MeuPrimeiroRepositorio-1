programa
{
	
	funcao inicio()
	{
		escreveLinha() // invocacao da funcao escreveLinha 
		//inteiro n1 = 3
		//soma(n1,5) passagem de parametro por valor
		inteiro numero = soma(3,4) //
		escreva(numero)
		escreveLinha()
	}
	
	funcao escreveLinha(){ // funcao que nao gera retorno, funcao tipo vazia (void)
		 escreva("\n------------**------------\n")
	}

	funcao inteiro soma(inteiro n1, inteiro n2){
		 inteiro sum = n1+n2
		 inteiro sub = n1-n2
		 //retorne sub
		 retorne sum // retorno da funcao para uma variavel da funcao inicio.
	}
}  
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 152; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */