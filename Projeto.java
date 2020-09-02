package desenvolvimento5;

class Empresa{
	String nome;
	String cnpj;
	String dataInauguracao;
	String socio;
	String filial;
	String dadosDaSede;
	double faturamento;
	
	void imprimir() {
		System.out.println("Nome: "+nome);
		System.out.println("CNPJ: "+cnpj);
		System.out.println("Sócio: "+socio);
		System.out.println("Filial: "+filial);
		System.out.println("Data Inauguração: "+dataInauguracao);
	}
	public Empresa(String nome, String cnpj, String socio, String filial, String dataInauguracao, String dadosDaSede) {
		super();
		this.nome = nome;
		this.cnpj = cnpj;
		this.socio = socio;
		this.filial = filial;
		this.dataInauguracao = dataInauguracao;
		this.dadosDaSede = dadosDaSede;
	}
	public double Colaborador(String nome, String matricula, double salarioAnual) {
		double salario = 12*salarioAnual;
		return salario;
	}
}

class Filial extends Empresa{
	String dadosFilial;

	public Filial(String nome, String cnpj, String socio, String filial, String dataInauguracao, String dadosFilial) {
		super(nome, cnpj, socio, filial, dataInauguracao, dadosFilial);
		
	}
	public void Colaborador() {
		
	}
	
}

class Socio {
	String nome;
	String CPF;
	String telefone;
	String dataNascimento;
	
	void imprimeSocio() {
		System.out.println("Nome: "+nome);
		System.out.println("CNPJ: "+CPF);
		System.out.println("Telefone: "+telefone);
		System.out.println("Data de Nascimento: "+dataNascimento);
	}
	public Socio(String nome, String CPF, String telefone, String dataNascimento) {
		this.nome = nome;
		this.CPF = CPF;
		this.telefone = telefone;
		this.dataNascimento = dataNascimento;
	}
}



public class Projeto {

	public static void main(String[] args) {
		
			

	}

}

/*
Implemente um sistema de controle de faturamento empresarial de forma que cada empresa apresente os seguintes dados: 
nome, CNPJ, data de inauguração, lista de sócios e filiais e dados da sede. Uma empresa deve ter, pelo menos, uma sede e pode não ter filiais.

Os dados que devem ser contemplados no caso:
dos sócios são: nome completo, CPF, telefone e data de nascimento;
das filiais são: nome do responsável, faturamento anual, endereço, código da filial e data de inauguração.

Para cada empresa, a sede e as filiais devem ter o cadastro dos colaboradores com os dados: matrícula, nome completo, 
salário anual e vínculo único. Ou seja, um colaborador não pode ser cadastrado em mais de uma unidade da mesma empresa.

O sistema deve oferecer as seguintes funcionalidades:
1. cálculo do faturamento anual. Se houver filiais, esse faturamento é somado ao da sede;
2. a filial com maior e menor faturamento, caso elas existam;
3. a média salarial da empresa;
4. o balanço anual da empresa, que consiste na diferença entre o faturamento anual e a soma dos salários dos colaboradores, mostrando 
se ele foi positivo ou negativo;
5. os dados dos sócios cujas empresas tiveram balanço anual negativo.

Trabalhe esse código em seu IDE, suba ele para sua conta no GitHub e compartilhe o link desse projeto no campo ao lado para que outros 
desenvolvedores possam analisá-lo.

*/