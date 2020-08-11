package desenvolvimento4;
import java.util.Scanner;
public class Responsavel {
	
	String nome;
	String telefone;
	String contato;
	double valorHora;

	void cadastrarResponsavel() {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Nome: ");
		nome = ler.nextLine();
		System.out.print("Telefone: ");
		telefone = ler.nextLine();
		System.out.print("Contato: ");
		contato = ler.nextLine();
		System.out.print("Valor hora: ");
		valorHora = Double.parseDouble(ler.nextLine());
	}
	
	void imprimeResponsavel() {
		System.out.println("Responsável");
		System.out.println("Nome: "+nome);
		System.out.println("Telefone: "+telefone);
		System.out.println("Contato: "+contato);
		System.out.println("Valor hora: "+valorHora);
		
		
	}
	
}