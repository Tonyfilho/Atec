package aula04ExercicioFolha02;

import javax.swing.JOptionPane;

public class Principal {
     Metodo metodo= new Metodo ();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n1, n2;
		n1 = Metodo.pegaNumero();
		n2 = Metodo.pegaNumero();
		System.out.println(n1);

		Metodo.CalculoNumero(n1, n2);
		
		Metodo.Printe();
		
		

		

	}// fim da void

}// fim class
