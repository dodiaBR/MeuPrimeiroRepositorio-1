programa
{
	inclua biblioteca Arquivos --> file
	
	funcao inicio(){
		
		const cadeia CAMINHO = "/frase.txt"
		inteiro opcao
		cadeia frase
		escreva("Digite 1 para ver a frase e 2 para alterá-la: ")
		leia(opcao)
		limpa() 
		se(opcao ==2){
			//alterar
			escreva("Digite uma nova frase: ")
			leia(frase)
			inteiro arquivo = file.abrir_arquivo(CAMINHO, file.MODO_ESCRITA)
			file.escrever_linha(frase, arquivo)
			file.fechar_arquivo(arquivo)
		}senao{
			//exibir
			//logico arquivo_exite = file.arquivo_existe(CAMINHO)
			se(file.arquivo_existe(CAMINHO)){
			inteiro arquivo = file.abrir_arquivo(CAMINHO, file.MODO_LEITURA)
			frase = file.ler_linha(arquivo)
			file.fechar_arquivo(arquivo)
			escreva("A frase é:\n\n ☺☺ "+frase+" ☺☺ ")
			}senao{
				escreva("Arquivo nao existente")
			}
		}
	}
}

/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 197; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */