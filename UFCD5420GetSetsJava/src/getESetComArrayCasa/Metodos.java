package getESetComArrayCasa;

public class Metodos {
	private String[] Nome = new String[12];
	private int[] Tel = new int[12];
	private float[] Sal = new float[12];
	private String[][] Agenda = new String[12][2];
	private int i = 0;
	private int j = 0;
	
	
	
	
	public String[] getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		this.Nome[i] = nome;
		i++;
	}
	public int[] getTel() {
		return Tel;
	}
	public void setTel(int tel) {
		this.Tel[i] = tel;
		i++;
	}
	public float[] getSal() {
		return Sal;
	}
	public void setSal(float sal) {
		this.Sal[i] = sal;
		i++;
	}
	public String[][] getAgenda() {
		return Agenda;
	}
/*	public void setAgenda(String nome, String numero) {
		this.i=nome;
		
		
		this.Agenda[i][j] = nome[i];
		i++;
		j++;
	} */
	
	public void Imprime() {
		for (int i = 0; i < Sal.length; i++) {
			System.out.println("O Nome do Funcionario " + Nome[i] + "O Telefone do Funcionario " + Tel[i]
					+" O valor do Deposito " + i+1 +"º com valor de " + Sal[i]);	}
		
	}// fim do imprime
    public  float TotalAnual() {
    	float total = 0;
    	for (int i = 0; i < Sal.length; i++) {
			total += Sal[i];
		}
    	return total;
    }// fim do totalAnual
    public float Media() {
    	float total = 0;
    	total = TotalAnual() / Sal.length;
    	return total;
    }// fim do media
    public void MesSalario(int x) {
    	System.out.println(" Salario do Mês "+ x+" é "+ Sal[x]);
    	
    }//fim mes salario
    
    public void AgendaAtual(int nAgenda) {
    	if(nAgenda <= Agenda.length) {
    	for (int i = 0; i < nAgenda; i++) {
			for (int j = 0; j < 2; j++) {
				System.out.println(" A Agenda do Funcionario é " +Agenda[nAgenda-1][j]);				
			}// fim 2º for
		} // fim 1º for 
    	}// fim do if
    	else {
    		System.out.println("Numero de Agenda errada");
    	}
    	
    }//fim da agenda
	
	
	
	
	
	
	
	
	

}// fim da class
