package desenvolvimento1;
import java.util.Scanner;
public class NextLevelUniversity {

	public static void main(String[] args) {

		Scanner ler = new Scanner(System.in);
		
		System.out.println("\t================");
		System.out.println("\t---Next Level---");
		System.out.println("\t================");
		
		System.out.println("\n  Calculo de sua média Bimestral");
		System.out.println("  ------------------------------");
		
		System.out.print("\nDigite seu nome: ");
		String nome = ler.nextLine();
		
		System.out.print("\nInsira a nota da sua prova (peso 3): ");
		double prova  = ler.nextDouble()*3; // ja multipliquei os pesos das provas nos inputs, é correto?
		while (prova < 0 || prova > 30) { // aqui eu tentei fazer um programa que só aceite valores de 0 a 10 desculpa se ta confuso ;-)
			System.out.print("Valor Inválido, digite um numero de 0 a 10: \n");
			prova = ler.nextDouble()*3;
		}
		
		System.out.print("Insira a nota do seu projeto (peso 3): ");
		double projeto  = ler.nextDouble()*3;
		while (projeto < 0 || projeto > 30) {// aqui eu tentei fazer um programa que só aceite valores de 0 a 10 desculpa se ta confuso ;-)
			System.out.print("Valor Inválido, digite um numero de 0 a 10: \n");
			projeto = ler.nextDouble()*3;
		}
		
		System.out.print("Insira a nota da sua lista de exercícios (peso 2): ");
		double listaExercicios  = ler.nextDouble()*2;
		while (listaExercicios < 0 || listaExercicios > 20) {// aqui eu tentei fazer um programa que só aceite valores de 0 a 10 desculpa se ta confuso ;-)
			System.out.print("Valor Inválido, digite um numero de 0 a 10: \n");
			listaExercicios = ler.nextDouble()*2;
		}
		
		System.out.print("Insira a nota da sua contribuição aos projetos de software livre (peso 3): ");
		double contribuicao  = ler.nextDouble()*3;
		while (contribuicao < 0 ||contribuicao > 30) {// aqui eu tentei fazer um programa que só aceite valores de 0 a 10 desculpa se ta confuso ;-)
			System.out.print("Valor Inválido, digite um numero de 0 a 10: \n");
			contribuicao = ler.nextDouble()*3;
		}
		
		System.out.println("\nA nota minima para aprovacao no bimestre é 8.");
				
		double media = (prova+projeto+listaExercicios+contribuicao)/11;
		double provaFinal = 10 - media;
		double recuperacao;
		
		if (media >= 8){
			System.out.printf("\nParabéns "+nome+", sua média bimestral foi: %.2f e você foi APROVADO",media);
			System.out.println("\n"); // aqui minha duvida, coloquei essas linhas aqui pois caso aprovado nesse if o programa nao imprime as linhas la embaixo
			System.out.println("\t================");
			System.out.println("\t---Next Level---");
			System.out.println("\t================");
			
		}else{
			System.out.printf("\n"+nome+" sua média foi: %.2f e voce está de recuperação.",media);
			System.out.printf("\nVocê precisa de uma nota mínima de %.2f na prova final, boa sorte!\n",provaFinal);
			System.out.print("\nInsira a nota de sua prova final: ");
		}
		
		
		
		recuperacao = ler.nextDouble();
		
		while (recuperacao < 0 || recuperacao >10) {
			System.out.print("Valor Inválido, digite um numero de 0 a 10: \n");
			recuperacao = ler.nextDouble();
		}
		
		if (recuperacao >= provaFinal) {
			System.out.println("\nO aluno "+nome+" foi APROVADO!!");
		}else{
			System.out.println("\nO aluno "+nome+" foi REPROVADO");
		}
		
		System.out.println("\n"); // essas aqui
		System.out.println("\t================");
		System.out.println("\t---Next Level---");
		System.out.println("\t================");
			
	}

}

/*
A Next Level, uma moderna e conceituada universidade, necessita de um sistema de gestão acadêmico.

Para o projeto piloto de implantação do sistema, você deve criar um programa que permita calcular a 
média semestral dos alunos.

A média semestral é a média aritmética simples das médias bimestrais. 

As médias bimestrais são compostas pelas seguintes atividades: prova (peso 3), projeto (peso 3), 
lista de exercícios (2) e contribuição em projetos de software livre/ conclusão de MOOCs recomendados 
pelo docente (3).

Os dados devem ser obtidos a partir de input pelo teclado e o programa deve exibir se o aluno foi 
aprovado ou reprovado. Considere que o aluno deve ser aprovado se obtiver nota igual ou maior que 8.

Caso o aluno tenha média menor que 8, determine também a nota mínima necessária para a pontuação na 
prova final, de forma que o aluno garanta aprovação na disciplina. Para tal, basta subtrair do valor 
10,00 o valor da média.

Trabalhe esse código em seu IDE, suba ele para sua conta no GitHub e compartilhe o link desse projeto 
no campo ao lado para que outros desenvolvedores possam analisá-lo.
*/