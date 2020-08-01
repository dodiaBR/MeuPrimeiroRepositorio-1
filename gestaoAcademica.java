package desenvolvimento2;
import java.util.Scanner;	
public class gestaoAcademica {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("=====================================");
		System.out.println("\t Gestão Acadêmica HSM");
		System.out.println("=====================================");
		System.out.println("\nCálculo das médias semestrais dos alunos.");
		System.out.println("-----------------------------------------");
		System.out.print("\nInforme o número de alunos da Turma: ");
		
		int numAlunos = Integer.parseInt(ler.nextLine()); //quantidade de alunos
		String nomes[] = new String[numAlunos];  // vetor para armazenar nomes dos alunos
	  		    
	    for (int i=0; i<nomes.length; i++) { // armazena no vetor nomes digitados pelo usuario
	      System.out.printf("Nome do %2do. aluno de %d: ", (i+1), numAlunos);
	      nomes[i] = ler.nextLine();
	    }
	    
	    System.out.println("\n");
	    
	    double[][] notasB1 = new double [numAlunos][3]; // vetor para armazenamento das notas das 3 avaliacoes do 1o bimestre (prova, projeto e exercicios) 
	    
	    System.out.println("-----------------------------------------------");	
	    System.out.println("Informe as notas das avaliacoes B1 de cada aluno: ");
	    System.out.println("-----------------------------------------------\n");
	    System.out.println("============================");
	    System.out.println("Provas do primeiro bimestre.");
	    System.out.println("============================");
	    
	    for (int l=0; l<nomes.length; l++){  
	    		System.out.println("Digite a nota da provaB1 (peso5) do aluno "+nomes[l]+":");
	    		notasB1[l][0] = ler.nextDouble()*5;  //armazenamento das provas na coluna 0 da matriz [0]
	    }
	    
	    System.out.println("\n");
	    System.out.println("==============================");
	    System.out.println("Projetos do primeiro bimestre.");
	    System.out.println("==============================");
	    
	    for (int l=0; l<nomes.length; l++){
    		System.out.println("Digite a nota do projetoB1 (peso3) do aluno "+nomes[l]+":");
    		notasB1[l][1] = ler.nextDouble()*3;     // armazenamento dos projetos na coluna 1 da matriz [1]
	    }
	    
	    System.out.println("\n");
	    System.out.println("================================");
	    System.out.println("Exercícios do primeiro bimestre.");
	    System.out.println("================================");
	    
	    for (int l=0; l<nomes.length; l++){
    		System.out.println("Digite a nota dos exerciciosB1 (peso2) do aluno "+nomes[l]+":");
    		notasB1[l][2] = ler.nextDouble()*2;     // armazenamento dos exercicios na coluna 2 da matriz [1]
	    }
	    
	    ler.nextLine();
	    
	    
	    double[] mediasB1 = new double[numAlunos]; //vetor para armazenamento das medias do 1 bimestre
	    
	    for (int l=0; l<numAlunos; l++) { 
	    	double soma = 0.0;                     // 'soma' é resetado para cada mudanca de 'l' (linha)
	    	for (int c=0; c<3; c++) {
	    		soma += notasB1[l][c];             // 'soma' recebe as notas de cada coluna (lembrando que as colunas sao, [0] provas, [1] projetos, [2] exercicios) por isso 'c<3'
	    	}
	    	mediasB1[l] = soma/10;                 // vetor mediasB1[] recebe soma / 10(total do peso das notas)
	    }
	    
	    
	    
	    int aluno=0;   // coloquei para mudanca de nomes de aluno, mas aparentemente o 'l' ja faria isso ;-)
	    for (int l=0; l<nomes.length; l++) {
	    	System.out.println("O alunx "+nomes[aluno]+" teve média de "+mediasB1[l]+" no primeiro Bimestre.");
	    	System.out.println("----------------------------------------\n");
	    	aluno++;   // coloquei para mudanca de nomes de aluno, mas aparentemente o 'l' ja faria isso ;-)
	    }
	    
	    double[][] notasB2 = new double [numAlunos][3];     // vetor para armazenamento das notas das 3 avaliacoes do 1o bimestre (prova, projeto e exercicios) 
	    
	    System.out.println("-----------------------------------------------");	
	    System.out.println("Informe as notas das avaliacoes B2 de cada aluno: ");
	    System.out.println("-----------------------------------------------\n");
	    
	    System.out.println("===========================");
	    System.out.println("Provas do segundo bimestre.");
	    System.out.println("===========================");
	    
	    for (int l=0; l<nomes.length; l++){
	    		System.out.println("Digite a nota da provaB1 (peso5) do aluno "+nomes[l]+":");
	    		notasB2[l][0] = ler.nextDouble()*5;
	    }
	    
	    System.out.println("\n");
	    System.out.println("=============================");
	    System.out.println("Projetos do segundo bimestre.");
	    System.out.println("=============================");
	    
	    for (int l=0; l<nomes.length; l++){
    		System.out.println("Digite a nota do projetoB1 (peso3) do aluno "+nomes[l]+":");
    		notasB2[l][1] = ler.nextDouble()*3;
	    }
	    
	    System.out.println("\n");
	    System.out.println("===============================");
	    System.out.println("Exercícios do segundo bimestre.");
	    System.out.println("===============================");
	    
	    for (int l=0; l<nomes.length; l++){
    		System.out.println("Digite a nota dos exerciciosB1 (peso2) do aluno "+nomes[l]+":");
    		notasB2[l][2] = ler.nextDouble()*2;
	    }
	    
	    System.out.println("\n");
	    
	    
	    double[] mediasB2 = new double[numAlunos];
	    
	    for (int l=0; l<numAlunos; l++) {
	    	double soma = 0.0;
	    	for (int c=0; c<3; c++) {
	    		soma += notasB2[l][c];
	    	}
	    	mediasB2[l] = soma/10;
	    }
	    
	    
	    
	    aluno=0;
	    for (int l=0; l<nomes.length; l++) {
	    	System.out.println("O alunx "+nomes[aluno]+" teve média de "+mediasB2[l]+" no segundo Bimestre.");
	    	System.out.println("-----------------------------------------------------\n");
	    	aluno++;
	    }
	    
	    
	    System.out.println("\n\t=========================");	
	    System.out.println("\tMédias semestrais finais: ");
	    System.out.println("\t=========================\n");
	    System.out.println("\nAlunos com médias semestrais iguais ou maiores que 8 serão Aprovados.");
	    System.out.println("Alunos com médias semestrais entre 5 e 7,9 terão que realizar a Avaliação Final (Recuperação).");
	    System.out.println("Alunos com médias semestrais menores que 5 serão Reprovados.\n");
	    
	    int numAprovados=0;
	    int numAF=0;
	    int numReprovados=0;
	    double maiorMedia=0;       //deve poder ser feito de outro jeito mas foi a melhor opcao que encontrei
	    double menorMedia=10;	   //deve poder ser feito de outro jeito mas foi a melhor opcao que encontrei
	   
	    double[] medTotal = new double[numAlunos];     // vetor para armazenamento da mediaTotal que será usada para comparar a maior e menos media
	   
	    for (int i=0; i<numAlunos; i++) { 
	    double mediaTotal = (mediasB1[i]+mediasB2[i])/2;
	    System.out.println("O alunx "+nomes[i]+" teve média semestral de "+mediaTotal);
	    medTotal[i] = mediaTotal;
	   
	   		if (mediaTotal>=8) {
	   			System.out.println(nomes[i]+" foi APROVADO.");
	   			System.out.println("------------------\n");
	   			numAprovados += 1;			//cada aluno aprovado é adicionado ao numero de Aprovados
	   			if (mediaTotal>maiorMedia){ // obter a maior media
	   			maiorMedia = mediaTotal;    
	   			}
	   			
	   		}else if (mediaTotal <8 && mediaTotal >=5) {
	   			System.out.println(nomes[i]+" está de RECUPERAÇÃO e deve realizar a AF (avaliação final).");
	   			System.out.println("---------------------------------------------------------------\n");
	   			numAF += 1;         //cada aluno em recuperacao é adicionado ao numero de alunos que farao Avaliacao Final
	   		}else {
	   			System.out.println(nomes[i]+" foi REPROVADO.");
	   			System.out.println("-------------------\n");
	   			numReprovados += 1;  //cada aluno em reprovado é adicionado ao numero de reprovados
	   			if (mediaTotal<menorMedia){  // obter a menor media
	   			menorMedia = mediaTotal;
	   			}
	   			
	   		}
	   	}
	    System.out.println("================================");
	    for (int i=0; i<numAlunos; i++){
	   		if (medTotal[i]==maiorMedia){     //relaciona o aluno a maior media, podendo dizer o nome do aluno que obteve maior media
	   			System.out.println("A maior media foi dx alunx "+nomes[i]+": "+medTotal[i]);
	   		}else if(medTotal[i]==menorMedia){    //relaciona o aluno a menor media, podendo dizer o nome do aluno que obteve menor media
	   			System.out.println("A menor media foi dx alunx "+nomes[i]+": "+medTotal[i]);		
	   		}
	   	}
	   	
	   	double mediaTurma=0;
	   	for (int i=0; i<numAlunos; i++){    //obtencao da soma das medias dos alunos  da Turma
	   		mediaTurma += medTotal[i];
	   	}
	   	
	   	mediaTurma = mediaTurma / numAlunos;     // soma das medias dos alunos dividido pelo numero de alunos
	   	
	   	System.out.println("A Média Geral da turma foi de: "+mediaTurma);
	   	System.out.println("==============================");
	   	System.out.println("Total de alunos Aprovados: "+numAprovados);
	   	System.out.println("Total de alunos em Recuperacao: "+numAF);
	   	System.out.println("Total de alunos Reprovados: "+numReprovados);
	   	
	   	System.out.println("\n=====================================");
		System.out.println("\t Gestão Acadêmica HSM");
		System.out.println("=====================================");
	   	
	   	
   }
	   

}


/*
Você foi convidado para criar um sistema de gestão acadêmica que deve calcular as médias semestrais dos alunos.
Inicialmente, você deve estruturar um programa para ser experimentado em apenas uma disciplina, como projeto piloto.

As notas de cada bimestre são compostas por três atividades avaliativas, com pesos diferentes: prova (peso 5), projeto (3) e lista de exercícios (2).
Os alunos são considerados aprovados, caso obtenham média semestral superior ou igual a 8.
Caso obtenham notas entre 7.9 e 5, devem realizar a Avaliação Final (AF) e os alunos com médias abaixo de 5, são considerados reprovados.

Desenvolva um código que ao fim da execução do programa, devem ser exibidas a média geral da turma, a menor e a maior nota. Assim como a quantidade de alunos que foram aprovados, reprovados e que necessitarão realizar AF.

Trabalhe esse código em seu IDE, suba ele para sua conta no GitHub e compartilhe o link desse projeto no campo ao lado para que outros desenvolvedores possam analisá-lo.

Observação: Existem diversas formas de determinar a maior e a menor média. Uma delas é utilizando um conceito que será estudado mais à frente neste curso, chamado vetores. Mas você pode utilizá-lo para a solução desta atividade.

*/