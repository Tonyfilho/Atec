package luizGetSet;

public class ClasseCadastro {
	//Atributos
	private String Nome;
	private int Telefone;
	private Float Salario;
	
	// construtores
	public ClasseCadastro() {};
	public ClasseCadastro(String s, int i, float f) {		
	}// fim do construtor
	
	
	//metodos get
	public String getNome() {return Nome;}
	public int getTelefone() {return Telefone;}
	public  float getSalario() {return Salario;}

	//metodos set
	
	public void setNome(String n) {Nome = n;}
	public void setTelefone(int i) {Telefone = i;}
	public void setSalario(float f) {Salario = f;}
	
	//outros Metodos
	public float getSalarioPeriodo(int num) {return this.Salario * num;};
	
}
