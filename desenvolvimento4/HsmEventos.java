package desenvolvimento4;
import java.util.Scanner;
public class HsmEventos {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("====================================");
		System.out.println("Cadastre os 3 Eventos Mensais da HSM");
		System.out.println("====================================\n");
		
		System.out.println("=========");
		System.out.println("Evento 1:");
		System.out.println("=========\n");
		Eventos um = new Eventos();
		um.cadastrarEvento();
		
		System.out.println("--------------------");
		System.out.println("Dados do Responsável");
		Responsavel resEvento1 = new Responsavel();
		resEvento1.cadastrarResponsavel();
		um.valorTotalResponsavel = resEvento1.valorHora * um.cargaHoraria;
		
		
				
		System.out.println("\n=========");
		System.out.println("Evento 2:");
		System.out.println("=========\n");
		Eventos dois = new Eventos();
		dois.cadastrarEvento();
		
		System.out.println("--------------------");
		System.out.println("Dados do Responsável");
		Responsavel resEvento2 = new Responsavel();
		resEvento2.cadastrarResponsavel();
		dois.valorTotalResponsavel = resEvento2.valorHora * dois.cargaHoraria;
		
		System.out.println("\n=========");
		System.out.println("Evento 3:");
		System.out.println("=========\n");
		Eventos tres = new Eventos();
		tres.cadastrarEvento();
		
		System.out.println("--------------------");
		System.out.println("Dados do Responsável");
		Responsavel resEvento3 = new Responsavel();
		resEvento3.cadastrarResponsavel();
		tres.valorTotalResponsavel = resEvento3.valorHora * tres.cargaHoraria;
		
		
		System.out.println("====================================");
		System.out.println("====================================");
		System.out.println("====================================");
		
			
		System.out.println("");
		double valorResponsaveis = um.valorTotalResponsavel+dois.valorTotalResponsavel+tres.valorTotalResponsavel;
		double valorTotalPalestras = um.valorTotalPalestras+dois.valorTotalPalestras+tres.valorTotalPalestras;
			
		double maior = um.valorTotalPalestrante[0];
		double menor = um.valorTotalPalestrante[0];
		String maiorPalestra = um.palestras[0];
		String menorPalestra = um.palestras[0];
		String nomeMaior = um.palestrante[0];
		String nomeMenor = um.palestrante[0];
		String contatoMaior = um.contatoPalestrante[0];
		String contatoMenor = um.contatoPalestrante[0];
		
		for (int i=0; i<um.palestras.length;i++) {
			if(um.valorTotalPalestrante[i] >= maior) {
				maior = um.valorTotalPalestrante[i];
				maiorPalestra = um.palestras[i];
				nomeMaior = um.palestrante[i];
				contatoMaior = um.contatoPalestrante[i];
				
			}else if (um.valorTotalPalestrante[i] <= menor) {
				menor = um.valorTotalPalestrante[i];
				menorPalestra = um.palestras[i];
				nomeMenor = um.palestrante[i];
				contatoMenor = um.contatoPalestrante[i];
			}
		}
		
		for (int i=0; i<dois.palestras.length;i++) {
			if(dois.valorTotalPalestrante[i] > maior) {
				maior = dois.valorTotalPalestrante[i];
				maiorPalestra = dois.palestras[i];
				nomeMaior = dois.palestrante[i];
				contatoMaior = dois.contatoPalestrante[i];
				
			}else if (dois.valorTotalPalestrante[i] < menor) {
				menor = dois.valorTotalPalestrante[i];
				menorPalestra = dois.palestras[i];
				nomeMenor = dois.palestrante[i];
				contatoMenor = dois.contatoPalestrante[i];
			}
		}
		
		for (int i=0; i<tres.palestras.length;i++) {
			if(tres.valorTotalPalestrante[i] > maior) {
				maior = tres.valorTotalPalestrante[i];
				maiorPalestra = tres.palestras[i];
				nomeMaior = tres.palestrante[i];
				contatoMaior = tres.contatoPalestrante[i];
				
			}else if (tres.valorTotalPalestrante[i] < menor) {
				menor = tres.valorTotalPalestrante[i];
				menorPalestra = tres.palestras[i];
				nomeMenor = tres.palestrante[i];
				contatoMenor = tres.contatoPalestrante[i];
			}
		}
		
		int op = 1;
		do {
			System.out.println("Escolha a opcao:");
			System.out.println("[1] Evento "+um.nome+" [2] Evento "+dois.nome+" [3] Evento "+tres.nome+" [4] Responsáveis [5] Valor Palestra Unitario  [6] Valores Totais [7] Maior e Menor Valor");
			int opcao = Integer.parseInt(ler.nextLine());
			
			switch (opcao) {
			case 1: um.imprimeEvento(); break;
			case 2: dois.imprimeEvento();break;
			case 3: tres.imprimeEvento();break;
			case 4: System.out.println("Evento "+um.nome+":");
					resEvento1.imprimeResponsavel();
					System.out.println("");
					System.out.println("Evento "+dois.nome+":");
					resEvento2.imprimeResponsavel();
					System.out.println("");
					System.out.println("Evento "+tres.nome+":");
					resEvento3.imprimeResponsavel();break;
			case 5: um.valorPalestra();
					dois.valorPalestra();
					tres.valorPalestra();break;		
			case 6: System.out.println("Valor gasto com responsáveis: "+valorResponsaveis);
					System.out.println("Valor total gasto com as Palestras: "+valorTotalPalestras);break;
			case 7: System.out.println("A palestra de maior valor foi "+maior+" do palestrante "+nomeMaior+"("+contatoMaior+") com a palestra sobre "+maiorPalestra);
					System.out.println("A palestra de menor valor foi "+menor+" do palestrante "+nomeMenor+"("+contatoMenor+") com a palestra sobre "+menorPalestra);break;
			default:System.out.println("Opcao Invalida.");
					
			}
			
			System.out.println("\nDeseja escolher outra opcao? [1]SIM [0]NAO");
			op = Integer.parseInt(ler.nextLine());
		}while(op==1);
		
		System.out.println("Fim Execucao.");
	}
}



/*
Implemente um sistema para uma empresa de eventos. Cada evento deve ter um nome, um responsável, as datas de início e fim, uma carga horária e lista de palestras. 

Os dados mínimos esperados para o responsável são nome completo, telefone para contato e valor por hora, mas, se for necessário, é possível incluir outras informações. 
Cada palestra deve ter um título, horário de início, palestrante, uma descrição e carga horária. Por fim, um palestrante terá o seu nome, contato e valor de uma hora de sua palestra.

O sistema deve fornecer:
1. o valor gasto com o responsável;
2. o valor total dos gastos com as palestras;
3. o valor total gasto por palestra;
4. os dados do palestrante com o maior e menor valor gasto em sua palestra.

Trabalhe esse código em seu IDE, suba ele para sua conta no GitHub e compartilhe o link desse projeto no campo ao lado para que outros desenvolvedores possam analisá-lo.
*/