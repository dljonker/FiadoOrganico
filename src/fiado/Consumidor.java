package fiado;

public class Consumidor {

	// Attributes
	//PACKAGE - PUBLIC - PROTECTED - PRIVATE
	private String nome;
	private int[] fiados;
	private int posicao = 0;
	private int telefone = 0;
	
	//CONSTRUTOR
	public Consumidor(String nome) {
		this.nome = nome;
		this.fiados = new int[10];
		this.telefone = 0;
	}
	
	//GETTER E SETTER
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void registrarFiado(int valor) {
		if (valor < 0) {
			System.out.println("Não é possível adicionar valores negativos!");
		} else {
			this.fiados[posicao] = valor;
			posicao++;
		}
		
	}
	
	public int getFiado() {
		int total = 0;
		for (int fiado : fiados) {
			total += fiado;
		}
		return total;
	}
	
	//TELEPHONE
	public int getTelefone() {
		return this.telefone;
	}
	
	public void setTelefone(int telefone) {
		this.telefone = telefone;
	}
}
