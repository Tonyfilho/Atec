package label;

public class Aluno {
	
private static String Nome;
private static int Idade;
private static float Nota1;
private static float Nota2;


public Aluno() {
	
}

public Aluno(String nome, int idade, float nota1, float nota2) {
	this.Nome=nome;
	this.Idade=idade;
	this.Nota1=nota1;
	this.Nota2=nota2;
	
}// fim do construtor




public static void setNome(String nome) {
	Nome = nome;
}
public static void setIdade(int idade) {
	Idade = idade;
}
public static void setNota1(float nota1) {
	Nota1 = nota1;
}
public static void setNota2(float nota2) {
	
}

public static String getNome() {
	return Nome;
}
public static int getIdade() {
	return Idade;
}
public static float getNota1() {
	return Nota1;
}

public static float getNota2() {
	return Nota2;
}

public static Aluno [] aluno(Object[][] o) {
	Aluno[]x = new Aluno[100];
	int i = 0;
	for (Object[] object : o) {
		x[i]= new Aluno((String)object[0],(Integer)object[1],(Float)object[2],(Float)object[3]);
		i++;
	}
	
	return x;
}// fim do aluno

public static float Mmedia(float n1, float n2) {
	float total = 0;
	total = (n1+n2)/2;
	
	return total;
}// fim do metodo







}/// fim da class
