programa
{
	inclua biblioteca Texto --> txt
	funcao inicio()
	{
		cadeia entrada
		inteiro numCarac, m=0, f=0, dif=0
		caracter a
		escreva("Digite a entrada: ")
		leia(entrada)
		entrada = txt.caixa_alta(entrada)
		numCarac = txt.numero_caracteres(entrada)
				
		para (inteiro i=0; i<numCarac; i++){
			a = txt.obter_caracter(entrada, i)
			se (a == 'F'){
				f++
			}senao se(a == 'M'){
				m++
			}senao{
				dif++
			}
		}

		escreva("A entrada resulta em "+f+" pessoas do genero feminino, "+m+" pessoas do genero masculino e "+dif+" pessoas que não se identificam com nenhum dos dois generos")
		
	}	
		
		
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 598; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */