package exercicioProva;

public class ClasseFuncionario {
	
	
	public static String Nome;
	public static float Salario;
	
	public ClasseFuncionario() {};
	public ClasseFuncionario(String s, float f) {
		
		this.Nome = s;
		this.Salario = f;
		
		
	}
	public static String getNome() {
		return Nome;
	}
	public static float getSalario() {
		return Salario;
	}
	public static void setNome(String nome) {
		Nome = nome;
	}
	public static void setSalario(float salario) {
		Salario = salario;
	
	};// fim do construtor	

}// fim da class
