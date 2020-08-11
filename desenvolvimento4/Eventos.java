package desenvolvimento4;
import java.util.Scanner;
public class Eventos {
	
	String nome;
	String dataInicio;
	String dataFim;
	int cargaHoraria;
	int num;
	int[] horaPalestra;
	String[] palestras;
	String[] descricaoPalestra;
	String[] palestrante;
	String[] contatoPalestrante;
	double[] valorPalestrante;
	double[] valorTotalPalestrante;
	double valorTotalResponsavel;
	double valorTotalPalestras;
	
	public void cadastrarEvento() {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Nome do Evento: ");
		nome = ler.nextLine();
								
		System.out.print("Data Início: ");
		dataInicio = ler.nextLine();
		
		System.out.print("Data Fim: ");
		dataFim = ler.nextLine();
		
		System.out.print("Numero de Palestras: ");
		
		int num = Integer.parseInt(ler.nextLine());
		palestras = new String[num];
		palestrante = new String [num];
		contatoPalestrante = new String [num];
		descricaoPalestra = new String [num];
		valorPalestrante = new double[num];
		valorTotalPalestrante = new double[num];
		horaPalestra = new int[num];
		
		for (int i=0;i<palestras.length; i++) {
			System.out.print("Palestra "+(i+1)+":");
		    palestras[i] = ler.nextLine();
		    System.out.print("Descricao ("+palestras[i]+"):");
		    descricaoPalestra[i] = ler.nextLine();
		    System.out.print("Carga horaria palestra "+(i+1)+"(horas):");
		    horaPalestra[i] = Integer.parseInt(ler.nextLine());
		    System.out.print("Palestrante: ");
		    palestrante[i] = ler.nextLine();
		    System.out.print("Valor hora de palestrante "+palestrante[i]+":");
		    valorPalestrante[i] = Double.parseDouble(ler.nextLine());
		    System.out.print("Contato "+palestrante[i]+":");
		    contatoPalestrante[i] = ler.nextLine();
		    valorTotalPalestrante[i] = valorPalestrante[i] * horaPalestra[i];
		    valorTotalPalestras += valorTotalPalestrante[i];
		    cargaHoraria += horaPalestra[i];
		    
		}
	}
	
	void imprimeEvento() {
		System.out.println("\n");
		System.out.println("Evento: "+this.nome);
		System.out.println("Data Início: "+this.dataInicio);
		System.out.println("Data Fim: "+this.dataFim);
		
		for(int i=0; i<palestras.length;i++) {
			System.out.println("Palestra "+(i+1)+": "+this.palestras[i]+" ("+this.horaPalestra[i]+" horas)");
			System.out.println("Descricao: "+this.descricaoPalestra[i]);
			System.out.println("Palestrante: "+this.palestrante[i]);
		}
		System.out.println("Carga Horaria: "+this.cargaHoraria+" horas");
	}
	
	void valorPalestra() {
		for (int i=0; i<palestras.length; i++) {
			System.out.println("O valor da Palestra "+palestras[i]+" é de "+valorTotalPalestrante[i]);
		}
	}
	
}
