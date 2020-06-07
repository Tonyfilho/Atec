package tipoDeClasses;

public class InnerClass extends Abstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new InnerClass().instanceMain2();
		
		
		
		
	}// fim da main
	
	
	public void instanceMain2() {
		new Main2().print1();
		metodo();// metodo abstract , não precisa instanciar na classe principal
		
	}// fim da instanceMain2
	
	 public class Main2 {
			/** dará um erro senão criarmos INSTANCE, que é um MEtodo proprio desta classe
			 * aqui, e não do MAIN*/	 
			public void print1() {
				System.out.println("Achamando nosso Metodo PRIVATE");
			}// end do metado
		}// fim da main2
	
}// fim do package


