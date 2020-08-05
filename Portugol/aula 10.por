programa
{
	
	funcao  inicio ()
	{
		inteiro pais
		cadeia ent = "O idioma é "
		escreva("--Idiomas--\n\n")
		escreva("Escolha um país:\n\n(1) Japão\t(5) Portugal\n(2) Holanda\t(6) Lituânia\n(3) Austrália\t(7) Azerbaijão\n(4) Brasil\t(8) África do Sul\n\n")
		escreva("->")
		leia (pais)
		
		escolha(pais) {
			caso 1: escreva(ent,"Japonês")
			pare
			caso 2: escreva(ent,"Neerlandês, Papiamento ou Língua Frísia")
			pare
			caso 3: escreva(ent,"Australiano")
			pare
			caso 4: escreva(ent,"Português")
			pare
			caso 5: escreva(ent,"Português")
			pare
			caso 6: escreva(ent,"Lituano")
			pare
			caso 7: escreva(ent,"Azeri ou Armênio")
			pare
			caso 8: escreva(ent,"Africâner, Inglês, Ndebele, Xhosa, Zulu, Soto do Norte, Tswana, Suázi, Venda ou Tsonga")
			pare
			caso contrario: escreva("Escolha um país válido")
		}

		
	}	
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 40; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */