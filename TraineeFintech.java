package desenvolvimento3;
import java.util.Scanner;

public class TraineeFintech {

	public static void main(String[] args) {
			
		Scanner scan = new Scanner(System.in);
		
		System.out.println("==============================================");
		System.out.println("--Média dos valores de ações na bolsa do mês--");
		System.out.println("==============================================");
		System.out.println("");
		
		double[][] valoresDia = new double[7][4];
		double[] mediaSemana = new double [4];
		double totalMes = 0; 
		double mediaMes;
		double mediaMaior;
		double mediaMenor;
		
		for (int semana=0 ;semana<valoresDia[0].length ;semana++) {    // lembrando que valoresDia[0].length sao colunas, [0].length sao sempre colunas!!
			System.out.println("Insira os dados da "+(semana+1)+"a semana: ");
			for(int dia=0; dia<valoresDia.length; dia++) {
				System.out.print("Dia "+(dia+1)+":");
				valoresDia[dia][semana] = scan.nextDouble();
			}
			System.out.println("");
		}
		scan.close();
		
		for (int i=0; i<valoresDia[0].length; i++) {  // medias de cada semana
			double soma = 0;						  //  'soma' volta para 0 apos cada semana
			for(int j=0; j<valoresDia.length; j++) {
				soma += valoresDia[j][i];
				mediaSemana[i] = soma/7;
			}
			totalMes += mediaSemana[i];
		}
		
		mediaMes = totalMes/4; 
		
		System.out.println("-------------------");
		System.out.println("--Médias Semanais--");
		System.out.println("-------------------");
		
		mediaMaior = mediaSemana[0];
		mediaMenor = mediaSemana[0];
		
		for (int i=0; i<mediaSemana.length; i++) {    // obter maior e menor valor
			if(mediaSemana[i]>mediaMaior) {
				mediaMaior = mediaSemana[i];
			}else if (mediaSemana[i]<mediaMenor){
				mediaMenor = mediaSemana[i];
			}	
		}
					
		for (int i=0; i<mediaSemana.length; i++) {
			System.out.printf("A média na "+(i+1)+"a semana foi de %.2f$\n",mediaSemana[i]);
		}
			
		System.out.println("");
		System.out.println("-----------------------");
		System.out.println("--Maior e Menor Média--");
		System.out.println("-----------------------");
		
		for (int i=0; i<mediaSemana.length; i++) {    // relacionar quais semanas têm maior e menor valores, nao sei se pode ser feito junto ao 'for' acima de obtencao de maior e menor valor, eu nao consegui.
			if (mediaSemana[i]==mediaMaior) {
				System.out.printf("A maior média foi da semana "+(i+1)+" com o valor de: %.2f$\n",mediaMaior);
				
			}else if (mediaSemana[i]==mediaMenor) {
				System.out.printf("A menor média foi da semana "+(i+1)+" com o valor de: %.2f$\n",mediaMenor);				
      		}
		}
		
		
		System.out.println("");
		System.out.println("------------------");
		System.out.println("---Média Mensal---");
		System.out.println("------------------");
		System.out.printf("A média total do mês foi de: %.2f$\n",mediaMes);
		
		System.out.println("");
		
		System.out.println("===========");
		System.out.println("--FINTECH--");
		System.out.println("===========");
		
		
		
	}

}
/*
Em um processo seletivo para trainee em uma fintech, foi solicitada a criação de um programa que permita calcular as médias dos valores de ações na bolsa ao longo de um mês.

Nesse caso, considere que os meses têm 28 dias e quatro semanas.

O programa deve apresentar as médias semanais (a menor e maior) e mensal.
*/